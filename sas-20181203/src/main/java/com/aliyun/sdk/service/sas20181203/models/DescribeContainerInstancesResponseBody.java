// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerInstancesResponseBody</p>
 */
public class DescribeContainerInstancesResponseBody extends TeaModel {
    @NameInMap("ContainerInstanceList")
    private java.util.List < ContainerInstanceList> containerInstanceList;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeContainerInstancesResponseBody(Builder builder) {
        this.containerInstanceList = builder.containerInstanceList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return containerInstanceList
     */
    public java.util.List < ContainerInstanceList> getContainerInstanceList() {
        return this.containerInstanceList;
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
        private java.util.List < ContainerInstanceList> containerInstanceList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * An array that consists of the information about containers.
         */
        public Builder containerInstanceList(java.util.List < ContainerInstanceList> containerInstanceList) {
            this.containerInstanceList = containerInstanceList;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContainerInstancesResponseBody build() {
            return new DescribeContainerInstancesResponseBody(this);
        } 

    } 

    public static class ContainerInstanceList extends TeaModel {
        @NameInMap("AlarmCount")
        private Integer alarmCount;

        @NameInMap("AlarmStatus")
        private String alarmStatus;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("ContainerId")
        private String containerId;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("HcCount")
        private Integer hcCount;

        @NameInMap("HcStatus")
        private String hcStatus;

        @NameInMap("HostIp")
        private String hostIp;

        @NameInMap("Image")
        private String image;

        @NameInMap("ImageDigest")
        private String imageDigest;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageRepoName")
        private String imageRepoName;

        @NameInMap("ImageRepoNamespace")
        private String imageRepoNamespace;

        @NameInMap("ImageRepoTag")
        private String imageRepoTag;

        @NameInMap("ImageUuid")
        private String imageUuid;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("NodeInfo")
        private String nodeInfo;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("Pod")
        private String pod;

        @NameInMap("PodIp")
        private String podIp;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RiskCount")
        private String riskCount;

        @NameInMap("RiskStatus")
        private String riskStatus;

        @NameInMap("UpdateMark")
        private String updateMark;

        @NameInMap("VulCount")
        private Integer vulCount;

        @NameInMap("VulStatus")
        private String vulStatus;

        private ContainerInstanceList(Builder builder) {
            this.alarmCount = builder.alarmCount;
            this.alarmStatus = builder.alarmStatus;
            this.appName = builder.appName;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.containerId = builder.containerId;
            this.createTimestamp = builder.createTimestamp;
            this.hcCount = builder.hcCount;
            this.hcStatus = builder.hcStatus;
            this.hostIp = builder.hostIp;
            this.image = builder.image;
            this.imageDigest = builder.imageDigest;
            this.imageId = builder.imageId;
            this.imageRepoName = builder.imageRepoName;
            this.imageRepoNamespace = builder.imageRepoNamespace;
            this.imageRepoTag = builder.imageRepoTag;
            this.imageUuid = builder.imageUuid;
            this.instanceId = builder.instanceId;
            this.namespace = builder.namespace;
            this.nodeInfo = builder.nodeInfo;
            this.nodeName = builder.nodeName;
            this.pod = builder.pod;
            this.podIp = builder.podIp;
            this.regionId = builder.regionId;
            this.riskCount = builder.riskCount;
            this.riskStatus = builder.riskStatus;
            this.updateMark = builder.updateMark;
            this.vulCount = builder.vulCount;
            this.vulStatus = builder.vulStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerInstanceList create() {
            return builder().build();
        }

        /**
         * @return alarmCount
         */
        public Integer getAlarmCount() {
            return this.alarmCount;
        }

        /**
         * @return alarmStatus
         */
        public String getAlarmStatus() {
            return this.alarmStatus;
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
         * @return containerId
         */
        public String getContainerId() {
            return this.containerId;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return hcCount
         */
        public Integer getHcCount() {
            return this.hcCount;
        }

        /**
         * @return hcStatus
         */
        public String getHcStatus() {
            return this.hcStatus;
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
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
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
         * @return nodeInfo
         */
        public String getNodeInfo() {
            return this.nodeInfo;
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
         * @return riskCount
         */
        public String getRiskCount() {
            return this.riskCount;
        }

        /**
         * @return riskStatus
         */
        public String getRiskStatus() {
            return this.riskStatus;
        }

        /**
         * @return updateMark
         */
        public String getUpdateMark() {
            return this.updateMark;
        }

        /**
         * @return vulCount
         */
        public Integer getVulCount() {
            return this.vulCount;
        }

        /**
         * @return vulStatus
         */
        public String getVulStatus() {
            return this.vulStatus;
        }

        public static final class Builder {
            private Integer alarmCount; 
            private String alarmStatus; 
            private String appName; 
            private String clusterId; 
            private String clusterName; 
            private String containerId; 
            private Long createTimestamp; 
            private Integer hcCount; 
            private String hcStatus; 
            private String hostIp; 
            private String image; 
            private String imageDigest; 
            private String imageId; 
            private String imageRepoName; 
            private String imageRepoNamespace; 
            private String imageRepoTag; 
            private String imageUuid; 
            private String instanceId; 
            private String namespace; 
            private String nodeInfo; 
            private String nodeName; 
            private String pod; 
            private String podIp; 
            private String regionId; 
            private String riskCount; 
            private String riskStatus; 
            private String updateMark; 
            private Integer vulCount; 
            private String vulStatus; 

            /**
             * The number of alerts.
             */
            public Builder alarmCount(Integer alarmCount) {
                this.alarmCount = alarmCount;
                return this;
            }

            /**
             * Indicates whether alerts are generated for the container. Valid values:
             * <p>
             * 
             * *   **YES**
             * *   **NO**
             */
            public Builder alarmStatus(String alarmStatus) {
                this.alarmStatus = alarmStatus;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The ID of cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the cluster.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The ID of the container.
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * The timestamp when the cluster was created. Unit: milliseconds.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * The number of baseline risks.
             */
            public Builder hcCount(Integer hcCount) {
                this.hcCount = hcCount;
                return this;
            }

            /**
             * Indicates whether baseline risks are detected. Valid values:
             * <p>
             * 
             * *   **NO**
             * *   **YES**
             */
            public Builder hcStatus(String hcStatus) {
                this.hcStatus = hcStatus;
                return this;
            }

            /**
             * The IP address of the server.
             */
            public Builder hostIp(String hostIp) {
                this.hostIp = hostIp;
                return this;
            }

            /**
             * The image of the container.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * The digest value of the image.
             */
            public Builder imageDigest(String imageDigest) {
                this.imageDigest = imageDigest;
                return this;
            }

            /**
             * The ID of the image.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The name of the image repository.
             */
            public Builder imageRepoName(String imageRepoName) {
                this.imageRepoName = imageRepoName;
                return this;
            }

            /**
             * The namespace to which the image repository belongs.
             */
            public Builder imageRepoNamespace(String imageRepoNamespace) {
                this.imageRepoNamespace = imageRepoNamespace;
                return this;
            }

            /**
             * The tag that is added to the image.
             */
            public Builder imageRepoTag(String imageRepoTag) {
                this.imageRepoTag = imageRepoTag;
                return this;
            }

            /**
             * The UUID of the image.
             */
            public Builder imageUuid(String imageUuid) {
                this.imageUuid = imageUuid;
                return this;
            }

            /**
             * The instance ID of the asset.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The node information.
             */
            public Builder nodeInfo(String nodeInfo) {
                this.nodeInfo = nodeInfo;
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
             * The pod.
             */
            public Builder pod(String pod) {
                this.pod = pod;
                return this;
            }

            /**
             * The IP address of the pod.
             */
            public Builder podIp(String podIp) {
                this.podIp = podIp;
                return this;
            }

            /**
             * The region ID of the container.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The number of risks.
             */
            public Builder riskCount(String riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * Indicates whether risks exist. Valid values:
             * <p>
             * 
             * *   **NO**
             * *   **YES**
             */
            public Builder riskStatus(String riskStatus) {
                this.riskStatus = riskStatus;
                return this;
            }

            /**
             * The update identifier of the container.
             */
            public Builder updateMark(String updateMark) {
                this.updateMark = updateMark;
                return this;
            }

            /**
             * The number of vulnerabilities that are detected in the container cluster.
             */
            public Builder vulCount(Integer vulCount) {
                this.vulCount = vulCount;
                return this;
            }

            /**
             * Indicates whether vulnerabilities are detected in the container. Valid values:
             * <p>
             * 
             * *   **YES**
             * *   **NO**
             */
            public Builder vulStatus(String vulStatus) {
                this.vulStatus = vulStatus;
                return this;
            }

            public ContainerInstanceList build() {
                return new ContainerInstanceList(this);
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
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
