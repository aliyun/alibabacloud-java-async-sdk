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
 * {@link DescribeImageListWithBaselineNameRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageListWithBaselineNameRequest</p>
 */
public class DescribeImageListWithBaselineNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaselineNameKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baselineNameKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerId")
    private String containerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Criteria")
    private String criteria;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CriteriaType")
    private String criteriaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Image")
    private String image;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageDigest")
    private String imageDigest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pod")
    private String pod;

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
    @com.aliyun.core.annotation.NameInMap("ScanRange")
    private java.util.List<String> scanRange;

    private DescribeImageListWithBaselineNameRequest(Builder builder) {
        super(builder);
        this.baselineNameKey = builder.baselineNameKey;
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.containerId = builder.containerId;
        this.criteria = builder.criteria;
        this.criteriaType = builder.criteriaType;
        this.currentPage = builder.currentPage;
        this.image = builder.image;
        this.imageDigest = builder.imageDigest;
        this.lang = builder.lang;
        this.namespace = builder.namespace;
        this.pageSize = builder.pageSize;
        this.pod = builder.pod;
        this.repoInstanceId = builder.repoInstanceId;
        this.repoName = builder.repoName;
        this.repoNamespace = builder.repoNamespace;
        this.scanRange = builder.scanRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageListWithBaselineNameRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baselineNameKey
     */
    public String getBaselineNameKey() {
        return this.baselineNameKey;
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
     * @return criteria
     */
    public String getCriteria() {
        return this.criteria;
    }

    /**
     * @return criteriaType
     */
    public String getCriteriaType() {
        return this.criteriaType;
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pod
     */
    public String getPod() {
        return this.pod;
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
     * @return scanRange
     */
    public java.util.List<String> getScanRange() {
        return this.scanRange;
    }

    public static final class Builder extends Request.Builder<DescribeImageListWithBaselineNameRequest, Builder> {
        private String baselineNameKey; 
        private String clusterId; 
        private String clusterName; 
        private String containerId; 
        private String criteria; 
        private String criteriaType; 
        private Integer currentPage; 
        private String image; 
        private String imageDigest; 
        private String lang; 
        private String namespace; 
        private Integer pageSize; 
        private String pod; 
        private String repoInstanceId; 
        private String repoName; 
        private String repoNamespace; 
        private java.util.List<String> scanRange; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageListWithBaselineNameRequest request) {
            super(request);
            this.baselineNameKey = request.baselineNameKey;
            this.clusterId = request.clusterId;
            this.clusterName = request.clusterName;
            this.containerId = request.containerId;
            this.criteria = request.criteria;
            this.criteriaType = request.criteriaType;
            this.currentPage = request.currentPage;
            this.image = request.image;
            this.imageDigest = request.imageDigest;
            this.lang = request.lang;
            this.namespace = request.namespace;
            this.pageSize = request.pageSize;
            this.pod = request.pod;
            this.repoInstanceId = request.repoInstanceId;
            this.repoName = request.repoName;
            this.repoNamespace = request.repoNamespace;
            this.scanRange = request.scanRange;
        } 

        /**
         * <p>The name of the image baseline check result.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ak_leak</p>
         */
        public Builder baselineNameKey(String baselineNameKey) {
            this.putQueryParameter("BaselineNameKey", baselineNameKey);
            this.baselineNameKey = baselineNameKey;
            return this;
        }

        /**
         * <p>The ID of the container cluster to query.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cc20a1024011c44b6a8710d6f8b****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>docker-law</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The container ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c08d5fc1a329a4b88950a253d082f****</p>
         */
        public Builder containerId(String containerId) {
            this.putQueryParameter("ContainerId", containerId);
            this.containerId = containerId;
            return this;
        }

        /**
         * <p>The query condition for the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>Unauthorized access</p>
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * <p>The query type for the baseline. Valid values:</p>
         * <ul>
         * <li><strong>BaselineNameAlias</strong>: baseline name</li>
         * <li><strong>BaselineClassAlias</strong>: baseline category.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BaselineNameAlias</p>
         */
        public Builder criteriaType(String criteriaType) {
            this.putQueryParameter("CriteriaType", criteriaType);
            this.criteriaType = criteriaType;
            return this;
        }

        /**
         * <p>The page number of the page to return. Default value: <strong>1</strong>, which indicates that the first page is returned.</p>
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
         * <p>The container image name.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-wulanchabu.aliyuncs.com/sas_test/huxin-test-001:nuxeo6-****</p>
         */
        public Builder image(String image) {
            this.putQueryParameter("Image", image);
            this.image = image;
            return this;
        }

        /**
         * <p>The SHA256 value of the image digest.</p>
         * 
         * <strong>example:</strong>
         * <p>2e6daffce524ffeae66cccaa90c8fc47de912346dcec295c27395b6d66db6423</p>
         */
        public Builder imageDigest(String imageDigest) {
            this.putQueryParameter("ImageDigest", imageDigest);
            this.imageDigest = imageDigest;
            return this;
        }

        /**
         * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English.</li>
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
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>test-002</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>Settings for paged query paging. The number of image baseline check result details to display per page. Default value: <strong>10</strong>, which indicates that 10 image baseline check result details are displayed per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The pod.</p>
         * 
         * <strong>example:</strong>
         * <p>22222-7xsqq</p>
         */
        public Builder pod(String pod) {
            this.putQueryParameter("Pod", pod);
            this.pod = pod;
            return this;
        }

        /**
         * <p>The instance ID of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>i-qewqrqcsadf****</p>
         */
        public Builder repoInstanceId(String repoInstanceId) {
            this.putQueryParameter("RepoInstanceId", repoInstanceId);
            this.repoInstanceId = repoInstanceId;
            return this;
        }

        /**
         * <p>The name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>libssh2</p>
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * <p>The namespace of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>libssh2</p>
         */
        public Builder repoNamespace(String repoNamespace) {
            this.putQueryParameter("RepoNamespace", repoNamespace);
            this.repoNamespace = repoNamespace;
            return this;
        }

        /**
         * <p>The collection of scan ranges.</p>
         */
        public Builder scanRange(java.util.List<String> scanRange) {
            this.putQueryParameter("ScanRange", scanRange);
            this.scanRange = scanRange;
            return this;
        }

        @Override
        public DescribeImageListWithBaselineNameRequest build() {
            return new DescribeImageListWithBaselineNameRequest(this);
        } 

    } 

}
