// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeGroupedContainerInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupedContainerInstancesResponseBody</p>
 */
public class DescribeGroupedContainerInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupedContainerInstanceList")
    private java.util.List < GroupedContainerInstanceList> groupedContainerInstanceList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeGroupedContainerInstancesResponseBody(Builder builder) {
        this.groupedContainerInstanceList = builder.groupedContainerInstanceList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupedContainerInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupedContainerInstanceList
     */
    public java.util.List < GroupedContainerInstanceList> getGroupedContainerInstanceList() {
        return this.groupedContainerInstanceList;
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
        private java.util.List < GroupedContainerInstanceList> groupedContainerInstanceList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>The information about the container.</p>
         */
        public Builder groupedContainerInstanceList(java.util.List < GroupedContainerInstanceList> groupedContainerInstanceList) {
            this.groupedContainerInstanceList = groupedContainerInstanceList;
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
         * <p>4E5BFDCF-B9DD-430D-9DA4-151BCB581C9D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGroupedContainerInstancesResponseBody build() {
            return new DescribeGroupedContainerInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGroupedContainerInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupedContainerInstancesResponseBody</p>
     */
    public static class GroupedContainerInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmCount")
        private Integer alarmCount;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CusterState")
        private String custerState;

        @com.aliyun.core.annotation.NameInMap("HcCount")
        private Integer hcCount;

        @com.aliyun.core.annotation.NameInMap("HostIp")
        private String hostIp;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("ImageDigest")
        private String imageDigest;

        @com.aliyun.core.annotation.NameInMap("ImageRepoName")
        private String imageRepoName;

        @com.aliyun.core.annotation.NameInMap("ImageRepoNamespace")
        private String imageRepoNamespace;

        @com.aliyun.core.annotation.NameInMap("ImageRepoTag")
        private String imageRepoTag;

        @com.aliyun.core.annotation.NameInMap("ImageUuid")
        private String imageUuid;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Integer instanceCount;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Pod")
        private String pod;

        @com.aliyun.core.annotation.NameInMap("PodIp")
        private String podIp;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RiskInstanceCount")
        private Integer riskInstanceCount;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("RiskStatus")
        private String riskStatus;

        @com.aliyun.core.annotation.NameInMap("SyncOpen")
        private Integer syncOpen;

        @com.aliyun.core.annotation.NameInMap("SyncStatus")
        private Integer syncStatus;

        @com.aliyun.core.annotation.NameInMap("VulCount")
        private Integer vulCount;

        private GroupedContainerInstanceList(Builder builder) {
            this.alarmCount = builder.alarmCount;
            this.appName = builder.appName;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterType = builder.clusterType;
            this.createTime = builder.createTime;
            this.custerState = builder.custerState;
            this.hcCount = builder.hcCount;
            this.hostIp = builder.hostIp;
            this.image = builder.image;
            this.imageDigest = builder.imageDigest;
            this.imageRepoName = builder.imageRepoName;
            this.imageRepoNamespace = builder.imageRepoNamespace;
            this.imageRepoTag = builder.imageRepoTag;
            this.imageUuid = builder.imageUuid;
            this.instanceCount = builder.instanceCount;
            this.instanceId = builder.instanceId;
            this.namespace = builder.namespace;
            this.pod = builder.pod;
            this.podIp = builder.podIp;
            this.regionId = builder.regionId;
            this.riskInstanceCount = builder.riskInstanceCount;
            this.riskLevel = builder.riskLevel;
            this.riskStatus = builder.riskStatus;
            this.syncOpen = builder.syncOpen;
            this.syncStatus = builder.syncStatus;
            this.vulCount = builder.vulCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupedContainerInstanceList create() {
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
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return custerState
         */
        public String getCusterState() {
            return this.custerState;
        }

        /**
         * @return hcCount
         */
        public Integer getHcCount() {
            return this.hcCount;
        }

        /**
         * @return hostIp
         */
        public String getHostIp() {
            return this.hostIp;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return imageDigest
         */
        public String getImageDigest() {
            return this.imageDigest;
        }

        /**
         * @return imageRepoName
         */
        public String getImageRepoName() {
            return this.imageRepoName;
        }

        /**
         * @return imageRepoNamespace
         */
        public String getImageRepoNamespace() {
            return this.imageRepoNamespace;
        }

        /**
         * @return imageRepoTag
         */
        public String getImageRepoTag() {
            return this.imageRepoTag;
        }

        /**
         * @return imageUuid
         */
        public String getImageUuid() {
            return this.imageUuid;
        }

        /**
         * @return instanceCount
         */
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return pod
         */
        public String getPod() {
            return this.pod;
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
         * @return riskInstanceCount
         */
        public Integer getRiskInstanceCount() {
            return this.riskInstanceCount;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return riskStatus
         */
        public String getRiskStatus() {
            return this.riskStatus;
        }

        /**
         * @return syncOpen
         */
        public Integer getSyncOpen() {
            return this.syncOpen;
        }

        /**
         * @return syncStatus
         */
        public Integer getSyncStatus() {
            return this.syncStatus;
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
            private String clusterId; 
            private String clusterName; 
            private String clusterType; 
            private Long createTime; 
            private String custerState; 
            private Integer hcCount; 
            private String hostIp; 
            private String image; 
            private String imageDigest; 
            private String imageRepoName; 
            private String imageRepoNamespace; 
            private String imageRepoTag; 
            private String imageUuid; 
            private Integer instanceCount; 
            private String instanceId; 
            private String namespace; 
            private String pod; 
            private String podIp; 
            private String regionId; 
            private Integer riskInstanceCount; 
            private String riskLevel; 
            private String riskStatus; 
            private Integer syncOpen; 
            private Integer syncStatus; 
            private Integer vulCount; 

            /**
             * <p>The number of alerts that are detected for the current pod, application, namespace, or cluster.</p>
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
             * <p>oss-liveness-probe</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cf3824769c85441b4bf3****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
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
             * <p>The timestamp when the cluster was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1600076893000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The status of the cluster. Valid values:</p>
             * <ul>
             * <li><strong>running</strong>: The cluster is running.</li>
             * <li><strong>stopped</strong>: The cluster is stopped.</li>
             * <li><strong>deleted</strong>: The cluster is deleted.</li>
             * <li><strong>delete_failed</strong>: The cluster failed to be deleted.</li>
             * <li><strong>failed</strong>: The cluster failed to be created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder custerState(String custerState) {
                this.custerState = custerState;
                return this;
            }

            /**
             * <p>The number of baseline risks that are detected for the current pod, application, namespace, or cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder hcCount(Integer hcCount) {
                this.hcCount = hcCount;
                return this;
            }

            /**
             * <p>The IP address of the host in the container cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>172.114.XX.XX</p>
             */
            public Builder hostIp(String hostIp) {
                this.hostIp = hostIp;
                return this;
            }

            /**
             * <p>The container image.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.ap-southeast-5.aliyuncs.com/log-service-release/sls-connector:1.1.77</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The digest value of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>58e58c013f70bbfde140c8a55c1078074b3483479428d4069aa946827fd566cf</p>
             */
            public Builder imageDigest(String imageDigest) {
                this.imageDigest = imageDigest;
                return this;
            }

            /**
             * <p>The name of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>test-003</p>
             */
            public Builder imageRepoName(String imageRepoName) {
                this.imageRepoName = imageRepoName;
                return this;
            }

            /**
             * <p>The namespace of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>name001</p>
             */
            public Builder imageRepoNamespace(String imageRepoNamespace) {
                this.imageRepoNamespace = imageRepoNamespace;
                return this;
            }

            /**
             * <p>The tag that is added to the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>dev-20220512-2</p>
             */
            public Builder imageRepoTag(String imageRepoTag) {
                this.imageRepoTag = imageRepoTag;
                return this;
            }

            /**
             * <p>The UUID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>e4bdec1d9ba7e0967111a7ea467c****</p>
             */
            public Builder imageUuid(String imageUuid) {
                this.imageUuid = imageUuid;
                return this;
            }

            /**
             * <p>The number of pods, applications, clusters, or namespaces.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-8vb9ul5xec4tua4q****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The namespace of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>kube-system</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The name of the pod.</p>
             * 
             * <strong>example:</strong>
             * <p>csi-plugin-2n****</p>
             */
            public Builder pod(String pod) {
                this.pod = pod;
                return this;
            }

            /**
             * <p>The IP address of the pod.</p>
             * 
             * <strong>example:</strong>
             * <p>172.114.XX.XX</p>
             */
            public Builder podIp(String podIp) {
                this.podIp = podIp;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The number of at-risk instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskInstanceCount(Integer riskInstanceCount) {
                this.riskInstanceCount = riskInstanceCount;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><strong>high</strong></li>
             * <li><strong>medium</strong></li>
             * <li><strong>low</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>low</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>Indicates whether risks were detected. Valid values:</p>
             * <ul>
             * <li><strong>NO</strong></li>
             * <li><strong>YES</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NO</p>
             */
            public Builder riskStatus(String riskStatus) {
                this.riskStatus = riskStatus;
                return this;
            }

            /**
             * <p>Indicates whether the synchronization of cluster audit logs is enabled. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled.</li>
             * <li><strong>1</strong>: enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder syncOpen(Integer syncOpen) {
                this.syncOpen = syncOpen;
                return this;
            }

            /**
             * <p>The status of the synchronization of cluster audit logs. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The synchronization failed.</li>
             * <li><strong>1</strong>: The synchronization is successful.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder syncStatus(Integer syncStatus) {
                this.syncStatus = syncStatus;
                return this;
            }

            /**
             * <p>The number of vulnerabilities that are detected for the current pod, application, namespace, or cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder vulCount(Integer vulCount) {
                this.vulCount = vulCount;
                return this;
            }

            public GroupedContainerInstanceList build() {
                return new GroupedContainerInstanceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGroupedContainerInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupedContainerInstancesResponseBody</p>
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
             * <p>The number of container assets returned on the current page.</p>
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
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of container assets returned.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
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
