// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupedMaliciousFilesRequest} extends {@link RequestModel}
 *
 * <p>DescribeGroupedMaliciousFilesRequest</p>
 */
public class DescribeGroupedMaliciousFilesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FuzzyMaliciousName")
    private String fuzzyMaliciousName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageDigest")
    private String imageDigest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageLayer")
    private String imageLayer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageTag")
    private String imageTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Levels")
    private String levels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaliciousMd5")
    private String maliciousMd5;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoId")
    private String repoId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoInstanceId")
    private String repoInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoName")
    private String repoName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoNamespace")
    private String repoNamespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoRegionId")
    private String repoRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanRange")
    private java.util.List < String > scanRange;

    private DescribeGroupedMaliciousFilesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.currentPage = builder.currentPage;
        this.fuzzyMaliciousName = builder.fuzzyMaliciousName;
        this.imageDigest = builder.imageDigest;
        this.imageLayer = builder.imageLayer;
        this.imageTag = builder.imageTag;
        this.lang = builder.lang;
        this.levels = builder.levels;
        this.maliciousMd5 = builder.maliciousMd5;
        this.pageSize = builder.pageSize;
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

    public static DescribeGroupedMaliciousFilesRequest create() {
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
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return fuzzyMaliciousName
     */
    public String getFuzzyMaliciousName() {
        return this.fuzzyMaliciousName;
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
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
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

    public static final class Builder extends Request.Builder<DescribeGroupedMaliciousFilesRequest, Builder> {
        private String clusterId; 
        private Integer currentPage; 
        private String fuzzyMaliciousName; 
        private String imageDigest; 
        private String imageLayer; 
        private String imageTag; 
        private String lang; 
        private String levels; 
        private String maliciousMd5; 
        private String pageSize; 
        private String repoId; 
        private String repoInstanceId; 
        private String repoName; 
        private String repoNamespace; 
        private String repoRegionId; 
        private java.util.List < String > scanRange; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGroupedMaliciousFilesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.currentPage = request.currentPage;
            this.fuzzyMaliciousName = request.fuzzyMaliciousName;
            this.imageDigest = request.imageDigest;
            this.imageLayer = request.imageLayer;
            this.imageTag = request.imageTag;
            this.lang = request.lang;
            this.levels = request.levels;
            this.maliciousMd5 = request.maliciousMd5;
            this.pageSize = request.pageSize;
            this.repoId = request.repoId;
            this.repoInstanceId = request.repoInstanceId;
            this.repoName = request.repoName;
            this.repoNamespace = request.repoNamespace;
            this.repoRegionId = request.repoRegionId;
            this.scanRange = request.scanRange;
        } 

        /**
         * The cluster ID of the container on which the malicious image sample is detected.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
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
         * The name of the malicious image sample that you want to query.
         * <p>
         * 
         * >  Fuzzy match is supported.
         */
        public Builder fuzzyMaliciousName(String fuzzyMaliciousName) {
            this.putQueryParameter("FuzzyMaliciousName", fuzzyMaliciousName);
            this.fuzzyMaliciousName = fuzzyMaliciousName;
            return this;
        }

        /**
         * The image digest.
         */
        public Builder imageDigest(String imageDigest) {
            this.putQueryParameter("ImageDigest", imageDigest);
            this.imageDigest = imageDigest;
            return this;
        }

        /**
         * The image layer.
         */
        public Builder imageLayer(String imageLayer) {
            this.putQueryParameter("ImageLayer", imageLayer);
            this.imageLayer = imageLayer;
            return this;
        }

        /**
         * The image tag.
         */
        public Builder imageTag(String imageTag) {
            this.putQueryParameter("ImageTag", imageTag);
            this.imageTag = imageTag;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The severity of the malicious image sample that you want to query. You can enter multiple severities. Separate the severities with commas (,). Valid values:
         * <p>
         * 
         * *   **serious**
         * *   **suspicious**
         * *   **remind**
         */
        public Builder levels(String levels) {
            this.putQueryParameter("Levels", levels);
            this.levels = levels;
            return this;
        }

        /**
         * The MD5 hash value of the malicious image sample.
         */
        public Builder maliciousMd5(String maliciousMd5) {
            this.putQueryParameter("MaliciousMd5", maliciousMd5);
            this.maliciousMd5 = maliciousMd5;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **20**.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the image repository.
         * <p>
         * 
         * >  You can call the [ListRepository](~~145293~~) operation to query the IDs of image repositories from the value of the **RepoId** response parameter.
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * The ID of the container image.
         * <p>
         * 
         * >  You can call the [ListRepository](~~145293~~) operation to query the IDs of container images from the value of the **InstanceId** response parameter.
         */
        public Builder repoInstanceId(String repoInstanceId) {
            this.putQueryParameter("RepoInstanceId", repoInstanceId);
            this.repoInstanceId = repoInstanceId;
            return this;
        }

        /**
         * The name of the image repository.
         * <p>
         * 
         * >  Fuzzy match is supported.
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * The namespace to which the image repository belongs.
         * <p>
         * 
         * >  Fuzzy match is supported.
         */
        public Builder repoNamespace(String repoNamespace) {
            this.putQueryParameter("RepoNamespace", repoNamespace);
            this.repoNamespace = repoNamespace;
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
        public Builder repoRegionId(String repoRegionId) {
            this.putQueryParameter("RepoRegionId", repoRegionId);
            this.repoRegionId = repoRegionId;
            return this;
        }

        /**
         * The types of the assets that you want to scan.
         */
        public Builder scanRange(java.util.List < String > scanRange) {
            this.putQueryParameter("ScanRange", scanRange);
            this.scanRange = scanRange;
            return this;
        }

        @Override
        public DescribeGroupedMaliciousFilesRequest build() {
            return new DescribeGroupedMaliciousFilesRequest(this);
        } 

    } 

}
