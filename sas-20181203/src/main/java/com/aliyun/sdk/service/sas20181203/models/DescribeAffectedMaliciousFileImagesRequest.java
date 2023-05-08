// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAffectedMaliciousFileImagesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAffectedMaliciousFileImagesRequest</p>
 */
public class DescribeAffectedMaliciousFileImagesRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("ClusterName")
    private String clusterName;

    @Query
    @NameInMap("ContainerId")
    private String containerId;

    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Integer currentPage;

    @Query
    @NameInMap("Image")
    private String image;

    @Query
    @NameInMap("ImageDigest")
    private String imageDigest;

    @Query
    @NameInMap("ImageLayer")
    private String imageLayer;

    @Query
    @NameInMap("ImageTag")
    private String imageTag;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Levels")
    private String levels;

    @Query
    @NameInMap("MaliciousMd5")
    private String maliciousMd5;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private String pageSize;

    @Query
    @NameInMap("Pod")
    private String pod;

    @Query
    @NameInMap("RepoId")
    private String repoId;

    @Query
    @NameInMap("RepoInstanceId")
    private String repoInstanceId;

    @Query
    @NameInMap("RepoName")
    private String repoName;

    @Query
    @NameInMap("RepoNamespace")
    private String repoNamespace;

    @Query
    @NameInMap("RepoRegionId")
    private String repoRegionId;

    @Query
    @NameInMap("ScanRange")
    private java.util.List < String > scanRange;

    private DescribeAffectedMaliciousFileImagesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.containerId = builder.containerId;
        this.currentPage = builder.currentPage;
        this.image = builder.image;
        this.imageDigest = builder.imageDigest;
        this.imageLayer = builder.imageLayer;
        this.imageTag = builder.imageTag;
        this.lang = builder.lang;
        this.levels = builder.levels;
        this.maliciousMd5 = builder.maliciousMd5;
        this.namespace = builder.namespace;
        this.pageSize = builder.pageSize;
        this.pod = builder.pod;
        this.repoId = builder.repoId;
        this.repoInstanceId = builder.repoInstanceId;
        this.repoName = builder.repoName;
        this.repoNamespace = builder.repoNamespace;
        this.repoRegionId = builder.repoRegionId;
        this.scanRange = builder.scanRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAffectedMaliciousFileImagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
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
     * @return imageLayer
     */
    public String getImageLayer() {
        return this.imageLayer;
    }

    /**
     * @return imageTag
     */
    public String getImageTag() {
        return this.imageTag;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return levels
     */
    public String getLevels() {
        return this.levels;
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
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
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
     * @return repoNamespace
     */
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

    /**
     * @return repoRegionId
     */
    public String getRepoRegionId() {
        return this.repoRegionId;
    }

    /**
     * @return scanRange
     */
    public java.util.List < String > getScanRange() {
        return this.scanRange;
    }

    public static final class Builder extends Request.Builder<DescribeAffectedMaliciousFileImagesRequest, Builder> {
        private String clusterId; 
        private String clusterName; 
        private String containerId; 
        private Integer currentPage; 
        private String image; 
        private String imageDigest; 
        private String imageLayer; 
        private String imageTag; 
        private String lang; 
        private String levels; 
        private String maliciousMd5; 
        private String namespace; 
        private String pageSize; 
        private String pod; 
        private String repoId; 
        private String repoInstanceId; 
        private String repoName; 
        private String repoNamespace; 
        private String repoRegionId; 
        private java.util.List < String > scanRange; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAffectedMaliciousFileImagesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.clusterName = request.clusterName;
            this.containerId = request.containerId;
            this.currentPage = request.currentPage;
            this.image = request.image;
            this.imageDigest = request.imageDigest;
            this.imageLayer = request.imageLayer;
            this.imageTag = request.imageTag;
            this.lang = request.lang;
            this.levels = request.levels;
            this.maliciousMd5 = request.maliciousMd5;
            this.namespace = request.namespace;
            this.pageSize = request.pageSize;
            this.pod = request.pod;
            this.repoId = request.repoId;
            this.repoInstanceId = request.repoInstanceId;
            this.repoName = request.repoName;
            this.repoNamespace = request.repoNamespace;
            this.repoRegionId = request.repoRegionId;
            this.scanRange = request.scanRange;
        } 

        /**
         * The language of the content within the request and the response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The name of the cluster.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * The total number of images that have malicious image samples.
         */
        public Builder containerId(String containerId) {
            this.putQueryParameter("ContainerId", containerId);
            this.containerId = containerId;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page **1**. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * An array consisting of the images that have malicious image samples.
         */
        public Builder image(String image) {
            this.putQueryParameter("Image", image);
            this.image = image;
            return this;
        }

        /**
         * The severity of the malicious image sample. Separate multiple severities with commas (,). Valid values: serious suspicious remind
         */
        public Builder imageDigest(String imageDigest) {
            this.putQueryParameter("ImageDigest", imageDigest);
            this.imageDigest = imageDigest;
            return this;
        }

        /**
         * The text that is highlighted.
         */
        public Builder imageLayer(String imageLayer) {
            this.putQueryParameter("ImageLayer", imageLayer);
            this.imageLayer = imageLayer;
            return this;
        }

        /**
         * The timestamp of the last scan.
         */
        public Builder imageTag(String imageTag) {
            this.putQueryParameter("ImageTag", imageTag);
            this.imageTag = imageTag;
            return this;
        }

        /**
         * The ID of the container cluster.
         * <p>
         * 
         * >  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of container clusters.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The region ID of the image repository. Valid values:
         * <p>
         * 
         * *   **cn-beijing**: China (Beijing)
         * *   **cn-zhangjiakou**: China (Zhangjiakou)
         * *   **cn-hangzhou**: China (Hangzhou)
         * *   **cn-shanghai**: China (Shanghai)
         * *   **cn-shenzhen**: China (Shenzhen)
         * *   **cn-hongkong**: China (Hong Kong)
         * *   **ap-southeast-1**: Singapore
         * *   **ap-southeast-5**: Indonesia (Jakarta)
         * *   **us-east-1**: US (Virginia)
         * *   **us-west-1**: US (Silicon Valley)
         * *   **eu-central-1**: Germany (Frankfurt)
         * *   **eu-west-1**: UK (London)
         * *   **ap-south-1**: India (Mumbai)
         */
        public Builder levels(String levels) {
            this.putQueryParameter("Levels", levels);
            this.levels = levels;
            return this;
        }

        /**
         * The timestamp of the first scan.
         */
        public Builder maliciousMd5(String maliciousMd5) {
            this.putQueryParameter("MaliciousMd5", maliciousMd5);
            this.maliciousMd5 = maliciousMd5;
            return this;
        }

        /**
         * The namespace to which the image repository belongs.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The name of the image.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The image layer.
         */
        public Builder pod(String pod) {
            this.putQueryParameter("Pod", pod);
            this.pod = pod;
            return this;
        }

        /**
         * The type of the asset that you want to scan. Valid values:
         * <p>
         * 
         * *   **container**
         * *   **image**
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * The ID of the container.
         */
        public Builder repoInstanceId(String repoInstanceId) {
            this.putQueryParameter("RepoInstanceId", repoInstanceId);
            this.repoInstanceId = repoInstanceId;
            return this;
        }

        /**
         * The number of images that have malicious image samples returned on the current page.
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * The image digest.
         */
        public Builder repoNamespace(String repoNamespace) {
            this.putQueryParameter("RepoNamespace", repoNamespace);
            this.repoNamespace = repoNamespace;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **20**.
         */
        public Builder repoRegionId(String repoRegionId) {
            this.putQueryParameter("RepoRegionId", repoRegionId);
            this.repoRegionId = repoRegionId;
            return this;
        }

        /**
         * The handling status of the malicious image sample. Valid values:
         * <p>
         * 
         * *   **0**: unhandled
         * *   **1**: handled
         * *   **2**: verifying
         * *   **3**: added to the whitelist
         */
        public Builder scanRange(java.util.List < String > scanRange) {
            this.putQueryParameter("ScanRange", scanRange);
            this.scanRange = scanRange;
            return this;
        }

        @Override
        public DescribeAffectedMaliciousFileImagesRequest build() {
            return new DescribeAffectedMaliciousFileImagesRequest(this);
        } 

    } 

}
