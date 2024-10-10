// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeImageGroupedVulListRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageGroupedVulListRequest</p>
 */
public class DescribeImageGroupedVulListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliasName")
    private String aliasName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CveId")
    private String cveId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

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
    @com.aliyun.core.annotation.NameInMap("IsLatest")
    private Integer isLatest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Necessity")
    private String necessity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PatchId")
    private Long patchId;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private String uuids;

    private DescribeImageGroupedVulListRequest(Builder builder) {
        super(builder);
        this.aliasName = builder.aliasName;
        this.clusterId = builder.clusterId;
        this.currentPage = builder.currentPage;
        this.cveId = builder.cveId;
        this.groupId = builder.groupId;
        this.imageDigest = builder.imageDigest;
        this.imageLayer = builder.imageLayer;
        this.imageTag = builder.imageTag;
        this.isLatest = builder.isLatest;
        this.lang = builder.lang;
        this.name = builder.name;
        this.necessity = builder.necessity;
        this.pageSize = builder.pageSize;
        this.patchId = builder.patchId;
        this.repoId = builder.repoId;
        this.repoInstanceId = builder.repoInstanceId;
        this.repoName = builder.repoName;
        this.repoNamespace = builder.repoNamespace;
        this.repoRegionId = builder.repoRegionId;
        this.scanRange = builder.scanRange;
        this.type = builder.type;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageGroupedVulListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
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
     * @return cveId
     */
    public String getCveId() {
        return this.cveId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
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
     * @return isLatest
     */
    public Integer getIsLatest() {
        return this.isLatest;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return necessity
     */
    public String getNecessity() {
        return this.necessity;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return patchId
     */
    public Long getPatchId() {
        return this.patchId;
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<DescribeImageGroupedVulListRequest, Builder> {
        private String aliasName; 
        private String clusterId; 
        private Integer currentPage; 
        private String cveId; 
        private String groupId; 
        private String imageDigest; 
        private String imageLayer; 
        private String imageTag; 
        private Integer isLatest; 
        private String lang; 
        private String name; 
        private String necessity; 
        private Integer pageSize; 
        private Long patchId; 
        private String repoId; 
        private String repoInstanceId; 
        private String repoName; 
        private String repoNamespace; 
        private String repoRegionId; 
        private java.util.List < String > scanRange; 
        private String type; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageGroupedVulListRequest request) {
            super(request);
            this.aliasName = request.aliasName;
            this.clusterId = request.clusterId;
            this.currentPage = request.currentPage;
            this.cveId = request.cveId;
            this.groupId = request.groupId;
            this.imageDigest = request.imageDigest;
            this.imageLayer = request.imageLayer;
            this.imageTag = request.imageTag;
            this.isLatest = request.isLatest;
            this.lang = request.lang;
            this.name = request.name;
            this.necessity = request.necessity;
            this.pageSize = request.pageSize;
            this.patchId = request.patchId;
            this.repoId = request.repoId;
            this.repoInstanceId = request.repoInstanceId;
            this.repoName = request.repoName;
            this.repoNamespace = request.repoNamespace;
            this.repoRegionId = request.repoRegionId;
            this.scanRange = request.scanRange;
            this.type = request.type;
            this.uuids = request.uuids;
        } 

        /**
         * <p>The alias of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>High severity vulnerability that affects org.eclipse.jetty:jetty-server</p>
         */
        public Builder aliasName(String aliasName) {
            this.putQueryParameter("AliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * <p>The ID of the container cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the ID of the container cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c60b77fe62093480db6164a3c2fa5****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
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
         * <p>The Common Vulnerabilities and Exposures (CVE) ID of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2017-15420</p>
         */
        public Builder cveId(String cveId) {
            this.putQueryParameter("CveId", cveId);
            this.cveId = cveId;
            return this;
        }

        /**
         * <p>The ID of the asset group.</p>
         * 
         * <strong>example:</strong>
         * <p>1311</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The SHA-256 value of the image digest.</p>
         * 
         * <strong>example:</strong>
         * <p>w213412341dfsfasdfafadfasfasf</p>
         */
        public Builder imageDigest(String imageDigest) {
            this.putQueryParameter("ImageDigest", imageDigest);
            this.imageDigest = imageDigest;
            return this;
        }

        /**
         * <p>The layer of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>b1f5b9420803ad0657cf21566e3e20acc08581e7f22991249ef3aa80b8b1c587</p>
         */
        public Builder imageLayer(String imageLayer) {
            this.putQueryParameter("ImageLayer", imageLayer);
            this.imageLayer = imageLayer;
            return this;
        }

        /**
         * <p>The tag of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>oval</p>
         */
        public Builder imageTag(String imageTag) {
            this.putQueryParameter("ImageTag", imageTag);
            this.imageTag = imageTag;
            return this;
        }

        /**
         * <p>Specifies whether to query the vulnerabilities in the latest images. If you do not specify this parameter, the vulnerabilities in all images are queried. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: does not query the vulnerabilities in the latest images.</li>
         * <li><strong>1</strong>: queries the vulnerabilities in the latest images.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isLatest(Integer isLatest) {
            this.putQueryParameter("IsLatest", isLatest);
            this.isLatest = isLatest;
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
         * <p>The name of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>debian:10:CVE-2019-9893</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The priority to fix the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>asap</strong>: high. You must fix the vulnerability at the earliest opportunity.</li>
         * <li><strong>later</strong>: medium. You can fix the vulnerability based on your business requirements.</li>
         * <li><strong>nntf</strong>: low. You can ignore the vulnerability.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asap</p>
         */
        public Builder necessity(String necessity) {
            this.putQueryParameter("Necessity", necessity);
            this.necessity = necessity;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the patch that is used to fix the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>1341512412</p>
         */
        public Builder patchId(Long patchId) {
            this.putQueryParameter("PatchId", patchId);
            this.patchId = patchId;
            return this;
        }

        /**
         * <p>The ID of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>qew****</p>
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
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
         * <p>The namespace to which the image repository belongs.</p>
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
         * <p>The region ID of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder repoRegionId(String repoRegionId) {
            this.putQueryParameter("RepoRegionId", repoRegionId);
            this.repoRegionId = repoRegionId;
            return this;
        }

        /**
         * <p>An array consisting of the types of the assets that you want to scan.</p>
         */
        public Builder scanRange(java.util.List < String > scanRange) {
            this.putQueryParameter("ScanRange", scanRange);
            this.scanRange = scanRange;
            return this;
        }

        /**
         * <p>The type of the vulnerability that you want to query. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: image system vulnerability</li>
         * <li><strong>sca</strong>: image application vulnerability</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The UUID of the asset. Separate multiple UUIDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>uuid-13134124****</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public DescribeImageGroupedVulListRequest build() {
            return new DescribeImageGroupedVulListRequest(this);
        } 

    } 

}
