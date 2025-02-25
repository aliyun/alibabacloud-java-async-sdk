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
    private java.util.List<String> scanRange;

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
    public java.util.List<String> getScanRange() {
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
        private java.util.List<String> scanRange; 

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
         * <p>The cluster ID of the container on which the malicious image sample is detected.</p>
         * 
         * <strong>example:</strong>
         * <p>c556c8133b5ad4378b7fc533ddbda****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The number of the page to return. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The name of the malicious image sample that you want to query.</p>
         * <blockquote>
         * <p> Fuzzy match is supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Mining</p>
         */
        public Builder fuzzyMaliciousName(String fuzzyMaliciousName) {
            this.putQueryParameter("FuzzyMaliciousName", fuzzyMaliciousName);
            this.fuzzyMaliciousName = fuzzyMaliciousName;
            return this;
        }

        /**
         * <p>The image digest.</p>
         * 
         * <strong>example:</strong>
         * <p>6a5e103187b31a94592a47a5858617f7****</p>
         */
        public Builder imageDigest(String imageDigest) {
            this.putQueryParameter("ImageDigest", imageDigest);
            this.imageDigest = imageDigest;
            return this;
        }

        /**
         * <p>The image layer.</p>
         * 
         * <strong>example:</strong>
         * <p>27213ad375b53628dd152a5ca****</p>
         */
        public Builder imageLayer(String imageLayer) {
            this.putQueryParameter("ImageLayer", imageLayer);
            this.imageLayer = imageLayer;
            return this;
        }

        /**
         * <p>The image tag.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        public Builder imageTag(String imageTag) {
            this.putQueryParameter("ImageTag", imageTag);
            this.imageTag = imageTag;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The severity of the malicious image sample that you want to query. You can enter multiple severities. Separate the severities with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>serious</strong></li>
         * <li><strong>suspicious</strong></li>
         * <li><strong>remind</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>serious</p>
         */
        public Builder levels(String levels) {
            this.putQueryParameter("Levels", levels);
            this.levels = levels;
            return this;
        }

        /**
         * <p>The MD5 hash value of the malicious image sample.</p>
         * 
         * <strong>example:</strong>
         * <p>d836968041f7683b5459****</p>
         */
        public Builder maliciousMd5(String maliciousMd5) {
            this.putQueryParameter("MaliciousMd5", maliciousMd5);
            this.maliciousMd5 = maliciousMd5;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the image repository.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/145293.html">ListRepository</a> operation to query the IDs of image repositories from the value of the <strong>RepoId</strong> response parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>crr-vridcl4****</p>
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * <p>The ID of the container image.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/145293.html">ListRepository</a> operation to query the IDs of container images from the value of the <strong>InstanceId</strong> response parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cri-datvailb****</p>
         */
        public Builder repoInstanceId(String repoInstanceId) {
            this.putQueryParameter("RepoInstanceId", repoInstanceId);
            this.repoInstanceId = repoInstanceId;
            return this;
        }

        /**
         * <p>The name of the image repository.</p>
         * <blockquote>
         * <p> Fuzzy match is supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>centos</p>
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * <p>The namespace to which the image repository belongs.</p>
         * <blockquote>
         * <p> Fuzzy match is supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hanghai-namespace</p>
         */
        public Builder repoNamespace(String repoNamespace) {
            this.putQueryParameter("RepoNamespace", repoNamespace);
            this.repoNamespace = repoNamespace;
            return this;
        }

        /**
         * <p>The region ID of the image repository. Valid values:</p>
         * <ul>
         * <li><strong>cn-beijing</strong>: China (Beijing)</li>
         * <li><strong>cn-zhangjiakou</strong>: China (Zhangjiakou)</li>
         * <li><strong>cn-hangzhou</strong>: China (Hangzhou)</li>
         * <li><strong>cn-shanghai</strong>: China (Shanghai)</li>
         * <li><strong>cn-shenzhen</strong>: China (Shenzhen)</li>
         * <li><strong>cn-hongkong</strong>: China (Hong Kong)</li>
         * <li><strong>ap-southeast-1</strong>: Singapore</li>
         * <li><strong>ap-southeast-5</strong>: Indonesia (Jakarta)</li>
         * <li><strong>us-east-1</strong>: US (Virginia)</li>
         * <li><strong>us-west-1</strong>: US (Silicon Valley)</li>
         * <li><strong>eu-central-1</strong>: Germany (Frankfurt)</li>
         * <li><strong>eu-west-1</strong>: UK (London)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder repoRegionId(String repoRegionId) {
            this.putQueryParameter("RepoRegionId", repoRegionId);
            this.repoRegionId = repoRegionId;
            return this;
        }

        /**
         * <p>The types of the assets that you want to scan.</p>
         */
        public Builder scanRange(java.util.List<String> scanRange) {
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
