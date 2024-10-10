// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAffectedMaliciousFileImagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAffectedMaliciousFileImagesResponseBody</p>
 */
public class DescribeAffectedMaliciousFileImagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AffectedMaliciousFileImagesResponse")
    private java.util.List < AffectedMaliciousFileImagesResponse> affectedMaliciousFileImagesResponse;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAffectedMaliciousFileImagesResponseBody(Builder builder) {
        this.affectedMaliciousFileImagesResponse = builder.affectedMaliciousFileImagesResponse;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAffectedMaliciousFileImagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return affectedMaliciousFileImagesResponse
     */
    public java.util.List < AffectedMaliciousFileImagesResponse> getAffectedMaliciousFileImagesResponse() {
        return this.affectedMaliciousFileImagesResponse;
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
        private java.util.List < AffectedMaliciousFileImagesResponse> affectedMaliciousFileImagesResponse; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>An array consisting of the images that have malicious image samples.</p>
         */
        public Builder affectedMaliciousFileImagesResponse(java.util.List < AffectedMaliciousFileImagesResponse> affectedMaliciousFileImagesResponse) {
            this.affectedMaliciousFileImagesResponse = affectedMaliciousFileImagesResponse;
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
         * <p>ACF97412-FD09-4D1F-994F-34DF12BREF20</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAffectedMaliciousFileImagesResponseBody build() {
            return new DescribeAffectedMaliciousFileImagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAffectedMaliciousFileImagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAffectedMaliciousFileImagesResponseBody</p>
     */
    public static class AffectedMaliciousFileImagesResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ContainerId")
        private String containerId;

        @com.aliyun.core.annotation.NameInMap("Digest")
        private String digest;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("FirstScanTimestamp")
        private Long firstScanTimestamp;

        @com.aliyun.core.annotation.NameInMap("HighLight")
        private String highLight;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("ImageUuid")
        private String imageUuid;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("LatestScanTimestamp")
        private Long latestScanTimestamp;

        @com.aliyun.core.annotation.NameInMap("LatestVerifyTimestamp")
        private Long latestVerifyTimestamp;

        @com.aliyun.core.annotation.NameInMap("Layer")
        private String layer;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("MaliciousMd5")
        private String maliciousMd5;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Pod")
        private String pod;

        @com.aliyun.core.annotation.NameInMap("RepoId")
        private String repoId;

        @com.aliyun.core.annotation.NameInMap("RepoInstanceId")
        private String repoInstanceId;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("RepoRegionId")
        private String repoRegionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("TargetName")
        private String targetName;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private AffectedMaliciousFileImagesResponse(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.containerId = builder.containerId;
            this.digest = builder.digest;
            this.downloadUrl = builder.downloadUrl;
            this.filePath = builder.filePath;
            this.firstScanTimestamp = builder.firstScanTimestamp;
            this.highLight = builder.highLight;
            this.id = builder.id;
            this.image = builder.image;
            this.imageUuid = builder.imageUuid;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.latestScanTimestamp = builder.latestScanTimestamp;
            this.latestVerifyTimestamp = builder.latestVerifyTimestamp;
            this.layer = builder.layer;
            this.level = builder.level;
            this.maliciousMd5 = builder.maliciousMd5;
            this.namespace = builder.namespace;
            this.pod = builder.pod;
            this.repoId = builder.repoId;
            this.repoInstanceId = builder.repoInstanceId;
            this.repoName = builder.repoName;
            this.repoRegionId = builder.repoRegionId;
            this.status = builder.status;
            this.tag = builder.tag;
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
            this.targetType = builder.targetType;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AffectedMaliciousFileImagesResponse create() {
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
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return firstScanTimestamp
         */
        public Long getFirstScanTimestamp() {
            return this.firstScanTimestamp;
        }

        /**
         * @return highLight
         */
        public String getHighLight() {
            return this.highLight;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return imageUuid
         */
        public String getImageUuid() {
            return this.imageUuid;
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
         * @return latestScanTimestamp
         */
        public Long getLatestScanTimestamp() {
            return this.latestScanTimestamp;
        }

        /**
         * @return latestVerifyTimestamp
         */
        public Long getLatestVerifyTimestamp() {
            return this.latestVerifyTimestamp;
        }

        /**
         * @return layer
         */
        public String getLayer() {
            return this.layer;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return maliciousMd5
         */
        public String getMaliciousMd5() {
            return this.maliciousMd5;
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
         * @return repoId
         */
        public String getRepoId() {
            return this.repoId;
        }

        /**
         * @return repoInstanceId
         */
        public String getRepoInstanceId() {
            return this.repoInstanceId;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return repoRegionId
         */
        public String getRepoRegionId() {
            return this.repoRegionId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
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
            private String downloadUrl; 
            private String filePath; 
            private Long firstScanTimestamp; 
            private String highLight; 
            private Long id; 
            private String image; 
            private String imageUuid; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private Long latestScanTimestamp; 
            private Long latestVerifyTimestamp; 
            private String layer; 
            private String level; 
            private String maliciousMd5; 
            private String namespace; 
            private String pod; 
            private String repoId; 
            private String repoInstanceId; 
            private String repoName; 
            private String repoRegionId; 
            private Integer status; 
            private String tag; 
            private String targetId; 
            private String targetName; 
            private String targetType; 
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
             * <p>The image digest.</p>
             * 
             * <strong>example:</strong>
             * <p>6a5e1031a5858617f7d8a179ead6****</p>
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * <p>The URL to download the malicious image sample.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://aegis-metadata-file.oss-cn-shanghai.aliyuncs.com/">https://aegis-metadata-file.oss-cn-shanghai.aliyuncs.com/</a></p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The path to the image file.</p>
             * 
             * <strong>example:</strong>
             * <p>/d836968041f7683b5605a****</p>
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * <p>The timestamp of the first scan.</p>
             * 
             * <strong>example:</strong>
             * <p>1594907349000</p>
             */
            public Builder firstScanTimestamp(Long firstScanTimestamp) {
                this.firstScanTimestamp = firstScanTimestamp;
                return this;
            }

            /**
             * <p>The text that is highlighted.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;ruleVersion&quot;:&quot;highlight_20210908&quot;,&quot;ruleId&quot;:600106,&quot;events&quot;:[[2,54]]}</p>
             */
            public Builder highLight(String highLight) {
                this.highLight = highLight;
                return this;
            }

            /**
             * <p>The ID of alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>1000040</p>
             */
            public Builder id(Long id) {
                this.id = id;
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
             * <p>The UUID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>e05c0de798217637868ef4****</p>
             */
            public Builder imageUuid(String imageUuid) {
                this.imageUuid = imageUuid;
                return this;
            }

            /**
             * <p>The name of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sql-test-001</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>47.101.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>172.22.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The timestamp of the last scan.</p>
             * 
             * <strong>example:</strong>
             * <p>1596522785000</p>
             */
            public Builder latestScanTimestamp(Long latestScanTimestamp) {
                this.latestScanTimestamp = latestScanTimestamp;
                return this;
            }

            /**
             * <p>The timestamp of the last verification.</p>
             * 
             * <strong>example:</strong>
             * <p>1596522711000</p>
             */
            public Builder latestVerifyTimestamp(Long latestVerifyTimestamp) {
                this.latestVerifyTimestamp = latestVerifyTimestamp;
                return this;
            }

            /**
             * <p>The image layer.</p>
             * 
             * <strong>example:</strong>
             * <p>27213ad3447f0209dd152a5cadea****</p>
             */
            public Builder layer(String layer) {
                this.layer = layer;
                return this;
            }

            /**
             * <p>The severity of the malicious image sample. Valid values:</p>
             * <ul>
             * <li><strong>serious</strong></li>
             * <li><strong>suspicious</strong></li>
             * <li><strong>remind</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>serious</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The MD5 hash value of the malicious image sample.</p>
             * 
             * <strong>example:</strong>
             * <p>d836968041f768300d9605a****</p>
             */
            public Builder maliciousMd5(String maliciousMd5) {
                this.maliciousMd5 = maliciousMd5;
                return this;
            }

            /**
             * <p>The namespace to which the image repository belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>hanghai-namespace</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
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
             * <p>The ID of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>crr-vridcl4****</p>
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>The ID of the container image.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-datvail3m****</p>
             */
            public Builder repoInstanceId(String repoInstanceId) {
                this.repoInstanceId = repoInstanceId;
                return this;
            }

            /**
             * <p>The name of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>centos</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The region ID of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder repoRegionId(String repoRegionId) {
                this.repoRegionId = repoRegionId;
                return this;
            }

            /**
             * <p>The handling status of the malicious image sample. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: unhandled</li>
             * <li><strong>1</strong>: handled</li>
             * <li><strong>2</strong>: verifying</li>
             * <li><strong>3</strong>: added to the whitelist</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tag that is added to the image.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The ID of the task object.</p>
             * 
             * <strong>example:</strong>
             * <p>m-bp17m0pc0xprzbwo****</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The name of the task object.</p>
             * 
             * <strong>example:</strong>
             * <p>source-test-obj-9LaLJ</p>
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * <p>The object type. Valid value:</p>
             * <ul>
             * <li><strong>ECS_IMAGE</strong></li>
             * <li><strong>ECS_SNAPSHOT</strong></li>
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
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>48a473c4-1650-4931-a822-7e6c2c28****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public AffectedMaliciousFileImagesResponse build() {
                return new AffectedMaliciousFileImagesResponse(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAffectedMaliciousFileImagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAffectedMaliciousFileImagesResponseBody</p>
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
             * <p>The number of images that have malicious image samples returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
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
             * <p>The total number of images that have malicious image samples.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
