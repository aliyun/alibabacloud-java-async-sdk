// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageVulListRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageVulListRequest</p>
 */
public class DescribeImageVulListRequest extends Request {
    @Query
    @NameInMap("AliasName")
    private String aliasName;

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
    private Integer currentPage;

    @Query
    @NameInMap("Dealed")
    private String dealed;

    @Query
    @NameInMap("Digest")
    private String digest;

    @Query
    @NameInMap("Image")
    private String image;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("Necessity")
    private String necessity;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Pod")
    private String pod;

    @Query
    @NameInMap("RegionId")
    private String regionId;

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

    @Query
    @NameInMap("StatusList")
    private String statusList;

    @Query
    @NameInMap("Tag")
    private String tag;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Query
    @NameInMap("Uuids")
    private String uuids;

    private DescribeImageVulListRequest(Builder builder) {
        super(builder);
        this.aliasName = builder.aliasName;
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.containerId = builder.containerId;
        this.currentPage = builder.currentPage;
        this.dealed = builder.dealed;
        this.digest = builder.digest;
        this.image = builder.image;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.necessity = builder.necessity;
        this.pageSize = builder.pageSize;
        this.pod = builder.pod;
        this.regionId = builder.regionId;
        this.repoId = builder.repoId;
        this.repoInstanceId = builder.repoInstanceId;
        this.repoName = builder.repoName;
        this.repoNamespace = builder.repoNamespace;
        this.repoRegionId = builder.repoRegionId;
        this.scanRange = builder.scanRange;
        this.statusList = builder.statusList;
        this.tag = builder.tag;
        this.type = builder.type;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageVulListRequest create() {
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
     * @return dealed
     */
    public String getDealed() {
        return this.dealed;
    }

    /**
     * @return digest
     */
    public String getDigest() {
        return this.digest;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
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
     * @return statusList
     */
    public String getStatusList() {
        return this.statusList;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
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

    public static final class Builder extends Request.Builder<DescribeImageVulListRequest, Builder> {
        private String aliasName; 
        private String clusterId; 
        private String clusterName; 
        private String containerId; 
        private Integer currentPage; 
        private String dealed; 
        private String digest; 
        private String image; 
        private String instanceId; 
        private String lang; 
        private String name; 
        private String namespace; 
        private String necessity; 
        private Integer pageSize; 
        private String pod; 
        private String regionId; 
        private String repoId; 
        private String repoInstanceId; 
        private String repoName; 
        private String repoNamespace; 
        private String repoRegionId; 
        private java.util.List < String > scanRange; 
        private String statusList; 
        private String tag; 
        private String type; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageVulListRequest request) {
            super(request);
            this.aliasName = request.aliasName;
            this.clusterId = request.clusterId;
            this.clusterName = request.clusterName;
            this.containerId = request.containerId;
            this.currentPage = request.currentPage;
            this.dealed = request.dealed;
            this.digest = request.digest;
            this.image = request.image;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.name = request.name;
            this.namespace = request.namespace;
            this.necessity = request.necessity;
            this.pageSize = request.pageSize;
            this.pod = request.pod;
            this.regionId = request.regionId;
            this.repoId = request.repoId;
            this.repoInstanceId = request.repoInstanceId;
            this.repoName = request.repoName;
            this.repoNamespace = request.repoNamespace;
            this.repoRegionId = request.repoRegionId;
            this.scanRange = request.scanRange;
            this.statusList = request.statusList;
            this.tag = request.tag;
            this.type = request.type;
            this.uuids = request.uuids;
        } 

        /**
         * The alias of the vulnerability.
         */
        public Builder aliasName(String aliasName) {
            this.putQueryParameter("AliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * The ID of the cluster to which the container belongs.
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
         * The ID of the container.
         */
        public Builder containerId(String containerId) {
            this.putQueryParameter("ContainerId", containerId);
            this.containerId = containerId;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Specifies whether the vulnerability is handled. Valid values:
         * <p>
         * 
         * *   **y**: handled
         * *   **n**: unhandled
         */
        public Builder dealed(String dealed) {
            this.putQueryParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * The digest of the image.
         */
        public Builder digest(String digest) {
            this.putQueryParameter("Digest", digest);
            this.digest = digest;
            return this;
        }

        /**
         * The name of the image.
         */
        public Builder image(String image) {
            this.putQueryParameter("Image", image);
            this.image = image;
            return this;
        }

        /**
         * The instance ID of the asset.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * The name of the vulnerability.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The priority to fix the vulnerability. Valid values:
         * <p>
         * 
         * *   **asap**: high. You must fix the vulnerability at the earliest opportunity.
         * *   **later**: medium. You can fix the vulnerability based on your business requirements.
         * *   **nntf**: low. You can ignore the vulnerability.
         */
        public Builder necessity(String necessity) {
            this.putQueryParameter("Necessity", necessity);
            this.necessity = necessity;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **10**
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The pod.
         */
        public Builder pod(String pod) {
            this.putQueryParameter("Pod", pod);
            this.pod = pod;
            return this;
        }

        /**
         * The region ID of the instance.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the image repository.
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * The instance ID of the image repository.
         */
        public Builder repoInstanceId(String repoInstanceId) {
            this.putQueryParameter("RepoInstanceId", repoInstanceId);
            this.repoInstanceId = repoInstanceId;
            return this;
        }

        /**
         * The name of the image repository.
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * The namespace to which the image repository belongs.
         */
        public Builder repoNamespace(String repoNamespace) {
            this.putQueryParameter("RepoNamespace", repoNamespace);
            this.repoNamespace = repoNamespace;
            return this;
        }

        /**
         * The region ID of the image repository.
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

        /**
         * The status of the vulnerability. Valid values:
         * <p>
         * 
         * *   **1**: unfixed
         * *   **4**: being fixed
         * *   **7**: fixed
         */
        public Builder statusList(String statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * The tag that is added to the image.
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The type of the vulnerability. Set the value to **cve**, which indicates image vulnerabilities.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The UUIDs of the assets. Separate multiple UUIDs with commas (,).
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public DescribeImageVulListRequest build() {
            return new DescribeImageVulListRequest(this);
        } 

    } 

}
