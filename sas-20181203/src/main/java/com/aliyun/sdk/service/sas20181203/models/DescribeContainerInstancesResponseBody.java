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
 * {@link DescribeContainerInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerInstancesResponseBody</p>
 */
public class DescribeContainerInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContainerInstanceList")
    private java.util.List<ContainerInstanceList> containerInstanceList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return containerInstanceList
     */
    public java.util.List<ContainerInstanceList> getContainerInstanceList() {
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
        private java.util.List<ContainerInstanceList> containerInstanceList; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeContainerInstancesResponseBody model) {
            this.containerInstanceList = model.containerInstanceList;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the container asset.</p>
         */
        public Builder containerInstanceList(java.util.List<ContainerInstanceList> containerInstanceList) {
            this.containerInstanceList = containerInstanceList;
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
         * <p>79CFF74D-E967-5407-8A78-EE03B925FDAA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContainerInstancesResponseBody build() {
            return new DescribeContainerInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeContainerInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerInstancesResponseBody</p>
     */
    public static class ContainerInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmCount")
        private Integer alarmCount;

        @com.aliyun.core.annotation.NameInMap("AlarmStatus")
        private String alarmStatus;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ContainerId")
        private String containerId;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("Exposed")
        private Integer exposed;

        @com.aliyun.core.annotation.NameInMap("ExposedDetail")
        private String exposedDetail;

        @com.aliyun.core.annotation.NameInMap("HcCount")
        private Integer hcCount;

        @com.aliyun.core.annotation.NameInMap("HcStatus")
        private String hcStatus;

        @com.aliyun.core.annotation.NameInMap("HostIp")
        private String hostIp;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("ImageDigest")
        private String imageDigest;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageRepoName")
        private String imageRepoName;

        @com.aliyun.core.annotation.NameInMap("ImageRepoNamespace")
        private String imageRepoNamespace;

        @com.aliyun.core.annotation.NameInMap("ImageRepoTag")
        private String imageRepoTag;

        @com.aliyun.core.annotation.NameInMap("ImageUuid")
        private String imageUuid;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("NodeInfo")
        private String nodeInfo;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("Pod")
        private String pod;

        @com.aliyun.core.annotation.NameInMap("PodIp")
        private String podIp;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RiskCount")
        private String riskCount;

        @com.aliyun.core.annotation.NameInMap("RiskStatus")
        private String riskStatus;

        @com.aliyun.core.annotation.NameInMap("UpdateMark")
        private String updateMark;

        @com.aliyun.core.annotation.NameInMap("VulCount")
        private Integer vulCount;

        @com.aliyun.core.annotation.NameInMap("VulStatus")
        private String vulStatus;

        private ContainerInstanceList(Builder builder) {
            this.alarmCount = builder.alarmCount;
            this.alarmStatus = builder.alarmStatus;
            this.appName = builder.appName;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.containerId = builder.containerId;
            this.createTimestamp = builder.createTimestamp;
            this.exposed = builder.exposed;
            this.exposedDetail = builder.exposedDetail;
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
         * @return exposed
         */
        public Integer getExposed() {
            return this.exposed;
        }

        /**
         * @return exposedDetail
         */
        public String getExposedDetail() {
            return this.exposedDetail;
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
            private Integer exposed; 
            private String exposedDetail; 
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

            private Builder() {
            } 

            private Builder(ContainerInstanceList model) {
                this.alarmCount = model.alarmCount;
                this.alarmStatus = model.alarmStatus;
                this.appName = model.appName;
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.containerId = model.containerId;
                this.createTimestamp = model.createTimestamp;
                this.exposed = model.exposed;
                this.exposedDetail = model.exposedDetail;
                this.hcCount = model.hcCount;
                this.hcStatus = model.hcStatus;
                this.hostIp = model.hostIp;
                this.image = model.image;
                this.imageDigest = model.imageDigest;
                this.imageId = model.imageId;
                this.imageRepoName = model.imageRepoName;
                this.imageRepoNamespace = model.imageRepoNamespace;
                this.imageRepoTag = model.imageRepoTag;
                this.imageUuid = model.imageUuid;
                this.instanceId = model.instanceId;
                this.namespace = model.namespace;
                this.nodeInfo = model.nodeInfo;
                this.nodeName = model.nodeName;
                this.pod = model.pod;
                this.podIp = model.podIp;
                this.regionId = model.regionId;
                this.riskCount = model.riskCount;
                this.riskStatus = model.riskStatus;
                this.updateMark = model.updateMark;
                this.vulCount = model.vulCount;
                this.vulStatus = model.vulStatus;
            } 

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
             * <p>Indicates whether alerts are generated for the container. Valid values:</p>
             * <ul>
             * <li><strong>YES</strong></li>
             * <li><strong>NO</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>YES</p>
             */
            public Builder alarmStatus(String alarmStatus) {
                this.alarmStatus = alarmStatus;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba-log-controller</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cfb41a869c71e4678a97021582dd8a****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The cluster name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The ID of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>48a6d9a92435a13ad573372c3f3c63b7e04d106458141df9f92155709d****</p>
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * <p>The timestamp when the cluster was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1670368337000</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>Indicates whether the asset is exposed to the Internet.</p>
             * <ul>
             * <li><strong>1</strong>: exposed</li>
             * <li><strong>0</strong>: not exposed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder exposed(Integer exposed) {
                this.exposed = exposed;
                return this;
            }

            /**
             * <p>The exposure details. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>[{}]</p>
             */
            public Builder exposedDetail(String exposedDetail) {
                this.exposedDetail = exposedDetail;
                return this;
            }

            /**
             * <p>The number of baseline risks.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hcCount(Integer hcCount) {
                this.hcCount = hcCount;
                return this;
            }

            /**
             * <p>Indicates whether baseline risks are detected. Valid values:</p>
             * <ul>
             * <li><strong>NO</strong></li>
             * <li><strong>YES</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>YES</p>
             */
            public Builder hcStatus(String hcStatus) {
                this.hcStatus = hcStatus;
                return this;
            }

            /**
             * <p>The IP address of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>172.24.XX.XX</p>
             */
            public Builder hostIp(String hostIp) {
                this.hostIp = hostIp;
                return this;
            }

            /**
             * <p>The image of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>docker.io/library/nginx:latest</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The digest value of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>5b046e2de8c490819125193ee2eb71a66f2cc16c032dcd8b69ead4be1024****</p>
             */
            public Builder imageDigest(String imageDigest) {
                this.imageDigest = imageDigest;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-beijing.aliyuncs.com/acs/log-controller@sha256:5b046e2de8c490819125193ee2eb71a66f2cc16c032dcd8b69ead4be1024****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The name of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>log-controller</p>
             */
            public Builder imageRepoName(String imageRepoName) {
                this.imageRepoName = imageRepoName;
                return this;
            }

            /**
             * <p>The namespace of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>acs</p>
             */
            public Builder imageRepoNamespace(String imageRepoNamespace) {
                this.imageRepoNamespace = imageRepoNamespace;
                return this;
            }

            /**
             * <p>The tag that is added to the image.</p>
             * 
             * <strong>example:</strong>
             * <p>0.3.1.0-dfa2010-aliyun</p>
             */
            public Builder imageRepoTag(String imageRepoTag) {
                this.imageRepoTag = imageRepoTag;
                return this;
            }

            /**
             * <p>The UUID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>5f23dfbceec289a49ac94e035e2****</p>
             */
            public Builder imageUuid(String imageUuid) {
                this.imageUuid = imageUuid;
                return this;
            }

            /**
             * <p>The instance ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2zegzjyotydfkz9****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>kube-system</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The node information.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder nodeInfo(String nodeInfo) {
                this.nodeInfo = nodeInfo;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The pod.</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba-log-controller-6f847f8786-mk2mg</p>
             */
            public Builder pod(String pod) {
                this.pod = pod;
                return this;
            }

            /**
             * <p>The IP address of the pod.</p>
             * 
             * <strong>example:</strong>
             * <p>172.24.XX.XX</p>
             */
            public Builder podIp(String podIp) {
                this.podIp = podIp;
                return this;
            }

            /**
             * <p>The region ID of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The number of risks.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskCount(String riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * <p>Indicates whether risks exist. Valid values:</p>
             * <ul>
             * <li><strong>NO</strong></li>
             * <li><strong>YES</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>YES</p>
             */
            public Builder riskStatus(String riskStatus) {
                this.riskStatus = riskStatus;
                return this;
            }

            /**
             * <p>The update identifier of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>79cff74d-e967-5407-8a78-ee03b9****</p>
             */
            public Builder updateMark(String updateMark) {
                this.updateMark = updateMark;
                return this;
            }

            /**
             * <p>The number of vulnerabilities that are detected in the container cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder vulCount(Integer vulCount) {
                this.vulCount = vulCount;
                return this;
            }

            /**
             * <p>Indicates whether vulnerabilities are detected in the container. Valid values:</p>
             * <ul>
             * <li><strong>YES</strong></li>
             * <li><strong>NO</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>YES</p>
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
    /**
     * 
     * {@link DescribeContainerInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerInstancesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
             * <p>45</p>
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
