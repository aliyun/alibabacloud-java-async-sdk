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
 * {@link DescribeImageListWithBaselineNameResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageListWithBaselineNameResponseBody</p>
 */
public class DescribeImageListWithBaselineNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageInfos")
    private java.util.List<ImageInfos> imageInfos;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeImageListWithBaselineNameResponseBody(Builder builder) {
        this.imageInfos = builder.imageInfos;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageListWithBaselineNameResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageInfos
     */
    public java.util.List<ImageInfos> getImageInfos() {
        return this.imageInfos;
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
        private java.util.List<ImageInfos> imageInfos; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>The information about the images.</p>
         */
        public Builder imageInfos(java.util.List<ImageInfos> imageInfos) {
            this.imageInfos = imageInfos;
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
         * <p>5B8C2156-2DB9-5A42-99E7-F2ED5AE9EA1F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageListWithBaselineNameResponseBody build() {
            return new DescribeImageListWithBaselineNameResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageListWithBaselineNameResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageListWithBaselineNameResponseBody</p>
     */
    public static class ImageInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ContainerId")
        private String containerId;

        @com.aliyun.core.annotation.NameInMap("Digest")
        private String digest;

        @com.aliyun.core.annotation.NameInMap("FirstScanTime")
        private Long firstScanTime;

        @com.aliyun.core.annotation.NameInMap("HighRiskImage")
        private Integer highRiskImage;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("ImageCreate")
        private Long imageCreate;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageSize")
        private Integer imageSize;

        @com.aliyun.core.annotation.NameInMap("ImageUpdate")
        private Long imageUpdate;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("LastScanTime")
        private Long lastScanTime;

        @com.aliyun.core.annotation.NameInMap("LowRiskImage")
        private Integer lowRiskImage;

        @com.aliyun.core.annotation.NameInMap("MiddleRiskImage")
        private Integer middleRiskImage;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("NoRiskImage")
        private Integer noRiskImage;

        @com.aliyun.core.annotation.NameInMap("Pod")
        private String pod;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RepoId")
        private String repoId;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("RepoNamespace")
        private String repoNamespace;

        @com.aliyun.core.annotation.NameInMap("RepoType")
        private String repoType;

        @com.aliyun.core.annotation.NameInMap("RiskStatus")
        private String riskStatus;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("TargetName")
        private String targetName;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("TotalItemCount")
        private Integer totalItemCount;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private ImageInfos(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.containerId = builder.containerId;
            this.digest = builder.digest;
            this.firstScanTime = builder.firstScanTime;
            this.highRiskImage = builder.highRiskImage;
            this.image = builder.image;
            this.imageCreate = builder.imageCreate;
            this.imageId = builder.imageId;
            this.imageSize = builder.imageSize;
            this.imageUpdate = builder.imageUpdate;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.lastScanTime = builder.lastScanTime;
            this.lowRiskImage = builder.lowRiskImage;
            this.middleRiskImage = builder.middleRiskImage;
            this.namespace = builder.namespace;
            this.noRiskImage = builder.noRiskImage;
            this.pod = builder.pod;
            this.regionId = builder.regionId;
            this.repoId = builder.repoId;
            this.repoName = builder.repoName;
            this.repoNamespace = builder.repoNamespace;
            this.repoType = builder.repoType;
            this.riskStatus = builder.riskStatus;
            this.tag = builder.tag;
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
            this.targetType = builder.targetType;
            this.totalItemCount = builder.totalItemCount;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageInfos create() {
            return builder().build();
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
         * @return digest
         */
        public String getDigest() {
            return this.digest;
        }

        /**
         * @return firstScanTime
         */
        public Long getFirstScanTime() {
            return this.firstScanTime;
        }

        /**
         * @return highRiskImage
         */
        public Integer getHighRiskImage() {
            return this.highRiskImage;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return imageCreate
         */
        public Long getImageCreate() {
            return this.imageCreate;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageSize
         */
        public Integer getImageSize() {
            return this.imageSize;
        }

        /**
         * @return imageUpdate
         */
        public Long getImageUpdate() {
            return this.imageUpdate;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return lastScanTime
         */
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        /**
         * @return lowRiskImage
         */
        public Integer getLowRiskImage() {
            return this.lowRiskImage;
        }

        /**
         * @return middleRiskImage
         */
        public Integer getMiddleRiskImage() {
            return this.middleRiskImage;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return noRiskImage
         */
        public Integer getNoRiskImage() {
            return this.noRiskImage;
        }

        /**
         * @return pod
         */
        public String getPod() {
            return this.pod;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return repoId
         */
        public String getRepoId() {
            return this.repoId;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return repoNamespace
         */
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        /**
         * @return repoType
         */
        public String getRepoType() {
            return this.repoType;
        }

        /**
         * @return riskStatus
         */
        public String getRiskStatus() {
            return this.riskStatus;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
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

        /**
         * @return totalItemCount
         */
        public Integer getTotalItemCount() {
            return this.totalItemCount;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private String containerId; 
            private String digest; 
            private Long firstScanTime; 
            private Integer highRiskImage; 
            private String image; 
            private Long imageCreate; 
            private String imageId; 
            private Integer imageSize; 
            private Long imageUpdate; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private Long lastScanTime; 
            private Integer lowRiskImage; 
            private Integer middleRiskImage; 
            private String namespace; 
            private Integer noRiskImage; 
            private String pod; 
            private String regionId; 
            private String repoId; 
            private String repoName; 
            private String repoNamespace; 
            private String repoType; 
            private String riskStatus; 
            private String tag; 
            private String targetId; 
            private String targetName; 
            private String targetType; 
            private Integer totalItemCount; 
            private String uuid; 

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c08d5fc1a329a4b88950a253d082f1****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>docker-law</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The ID of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>04d20e98c8e2c93b7b864372084320a15a58c8671e53c972ce3a71d9c163****</p>
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * <p>The SHA-256 value of the image digest.</p>
             * 
             * <strong>example:</strong>
             * <p>2e6daffce524ffeae66cccaa90c8fc47de912346dcec295c27395b6d66db6423</p>
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * <p>The timestamp generated when the first scan was performed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649814050000</p>
             */
            public Builder firstScanTime(Long firstScanTime) {
                this.firstScanTime = firstScanTime;
                return this;
            }

            /**
             * <p>The number of images on which <strong>high</strong> baseline risks are detected.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder highRiskImage(Integer highRiskImage) {
                this.highRiskImage = highRiskImage;
                return this;
            }

            /**
             * <p>The name of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>registry.cn-wulanchabu.aliyuncs.com/sas_test/huxin-test-001:nuxeo6-conta****</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The timestamp when the image was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1636962328000</p>
             */
            public Builder imageCreate(Long imageCreate) {
                this.imageCreate = imageCreate;
                return this;
            }

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>cddb5fd33b34a1fabb358d0a19497cdfe362fe624821cb250947af0ea5cc****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The size of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>157408623</p>
             */
            public Builder imageSize(Integer imageSize) {
                this.imageSize = imageSize;
                return this;
            }

            /**
             * <p>The timestamp when the image was updated. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1636974116000</p>
             */
            public Builder imageUpdate(Long imageUpdate) {
                this.imageUpdate = imageUpdate;
                return this;
            }

            /**
             * <p>The ID of the image instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-a595qp31knh9****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>pre.mongo-196</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>47.96.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The timestamp when the last baseline check was performed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649814050000</p>
             */
            public Builder lastScanTime(Long lastScanTime) {
                this.lastScanTime = lastScanTime;
                return this;
            }

            /**
             * <p>The number of images on which <strong>low</strong> baseline risks are detected.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lowRiskImage(Integer lowRiskImage) {
                this.lowRiskImage = lowRiskImage;
                return this;
            }

            /**
             * <p>The number of images on which <strong>medium</strong> baseline risks are detected.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder middleRiskImage(Integer middleRiskImage) {
                this.middleRiskImage = middleRiskImage;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>test-002</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The number of images that do not have baseline risks.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder noRiskImage(Integer noRiskImage) {
                this.noRiskImage = noRiskImage;
                return this;
            }

            /**
             * <p>The pod.</p>
             * 
             * <strong>example:</strong>
             * <p>22222-7xsqq</p>
             */
            public Builder pod(String pod) {
                this.pod = pod;
                return this;
            }

            /**
             * <p>The region ID of the image instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>crr-1lt6q7167yh6****</p>
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>The name of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>scanner</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The namespace to which the image repository belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>libssh2</p>
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * <p>The type of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>PRIVATE</p>
             */
            public Builder repoType(String repoType) {
                this.repoType = repoType;
                return this;
            }

            /**
             * <p>Indicates whether the image is at risk. Valid values:</p>
             * <ul>
             * <li><strong>YES</strong></li>
             * <li><strong>NO</strong></li>
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
             * <p>The version of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The ID of the asset on which the baseline check is performed.</p>
             * 
             * <strong>example:</strong>
             * <p>m-bp17m0pc0xprzbwo****</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The name of the asset on which the baseline check is performed.</p>
             * 
             * <strong>example:</strong>
             * <p>spod</p>
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * <p>The type of the asset on which the baseline check is performed. Valid values:</p>
             * <ul>
             * <li>ECS_IMAGE</li>
             * <li>ECS_SNAPSHOT</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECS_IMAGE</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The total number of risk items that are detected on the image by using the baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalItemCount(Integer totalItemCount) {
                this.totalItemCount = totalItemCount;
                return this;
            }

            /**
             * <p>The UUID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>f58681174f944623345379e23b7b****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public ImageInfos build() {
                return new ImageInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImageListWithBaselineNameResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageListWithBaselineNameResponseBody</p>
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
             * <p>The number of the images returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page. Default value: <strong>1</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page. Default value: <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of images on which baseline risks are detected.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
