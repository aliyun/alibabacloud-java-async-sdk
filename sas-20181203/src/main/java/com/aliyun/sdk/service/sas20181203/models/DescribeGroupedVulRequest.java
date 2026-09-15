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
 * {@link DescribeGroupedVulRequest} extends {@link RequestModel}
 *
 * <p>DescribeGroupedVulRequest</p>
 */
public class DescribeGroupedVulRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliasName")
    private String aliasName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetType")
    private String assetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttachTypes")
    private String attachTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerFieldName")
    private String containerFieldName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerFieldValue")
    private String containerFieldValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CveId")
    private String cveId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dealed")
    private String dealed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Necessity")
    private String necessity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RaspDefend")
    private Integer raspDefend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchTags")
    private String searchTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private String uuids;

    private DescribeGroupedVulRequest(Builder builder) {
        super(builder);
        this.aliasName = builder.aliasName;
        this.assetType = builder.assetType;
        this.attachTypes = builder.attachTypes;
        this.clusterId = builder.clusterId;
        this.containerFieldName = builder.containerFieldName;
        this.containerFieldValue = builder.containerFieldValue;
        this.currentPage = builder.currentPage;
        this.cveId = builder.cveId;
        this.dealed = builder.dealed;
        this.groupId = builder.groupId;
        this.lang = builder.lang;
        this.necessity = builder.necessity;
        this.pageSize = builder.pageSize;
        this.raspDefend = builder.raspDefend;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.searchTags = builder.searchTags;
        this.targetType = builder.targetType;
        this.type = builder.type;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupedVulRequest create() {
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
     * @return assetType
     */
    public String getAssetType() {
        return this.assetType;
    }

    /**
     * @return attachTypes
     */
    public String getAttachTypes() {
        return this.attachTypes;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return containerFieldName
     */
    public String getContainerFieldName() {
        return this.containerFieldName;
    }

    /**
     * @return containerFieldValue
     */
    public String getContainerFieldValue() {
        return this.containerFieldValue;
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
     * @return dealed
     */
    public String getDealed() {
        return this.dealed;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
     * @return raspDefend
     */
    public Integer getRaspDefend() {
        return this.raspDefend;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return searchTags
     */
    public String getSearchTags() {
        return this.searchTags;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
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

    public static final class Builder extends Request.Builder<DescribeGroupedVulRequest, Builder> {
        private String aliasName; 
        private String assetType; 
        private String attachTypes; 
        private String clusterId; 
        private String containerFieldName; 
        private String containerFieldValue; 
        private Integer currentPage; 
        private String cveId; 
        private String dealed; 
        private String groupId; 
        private String lang; 
        private String necessity; 
        private Integer pageSize; 
        private Integer raspDefend; 
        private Long resourceDirectoryAccountId; 
        private String searchTags; 
        private String targetType; 
        private String type; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGroupedVulRequest request) {
            super(request);
            this.aliasName = request.aliasName;
            this.assetType = request.assetType;
            this.attachTypes = request.attachTypes;
            this.clusterId = request.clusterId;
            this.containerFieldName = request.containerFieldName;
            this.containerFieldValue = request.containerFieldValue;
            this.currentPage = request.currentPage;
            this.cveId = request.cveId;
            this.dealed = request.dealed;
            this.groupId = request.groupId;
            this.lang = request.lang;
            this.necessity = request.necessity;
            this.pageSize = request.pageSize;
            this.raspDefend = request.raspDefend;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.searchTags = request.searchTags;
            this.targetType = request.targetType;
            this.type = request.type;
            this.uuids = request.uuids;
        } 

        /**
         * <p>The alias of the vulnerability to query.</p>
         * 
         * <strong>example:</strong>
         * <p>RHSA-2019:0230-Important: polkit security update</p>
         */
        public Builder aliasName(String aliasName) {
            this.putQueryParameter("AliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * <p>The Asset Type where the vulnerability is detected. Separate multiple types with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>ECS</strong>: host asset</li>
         * <li><strong>CONTAINER</strong>: container asset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS,CONTAINER</p>
         */
        public Builder assetType(String assetType) {
            this.putQueryParameter("AssetType", assetType);
            this.assetType = assetType;
            return this;
        }

        /**
         * <p>The vulnerability type. This query condition is valid only for application vulnerabilities. Separate multiple values with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>sca</strong>: software constituency parsing vulnerability</li>
         * <li><strong>app</strong>: application vulnerability.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sca</p>
         */
        public Builder attachTypes(String attachTypes) {
            this.putQueryParameter("AttachTypes", attachTypes);
            this.attachTypes = attachTypes;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c88fb10da1168494091db6aafc5dd****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The container search field. Valid values:</p>
         * <ul>
         * <li><strong>instanceId</strong>: instance ID</li>
         * <li><strong>appName</strong>: application name</li>
         * <li><strong>clusterId</strong>: cluster ID</li>
         * <li><strong>regionId</strong>: region</li>
         * <li><strong>nodeName</strong>: node name</li>
         * <li><strong>namespace</strong>: namespace</li>
         * <li><strong>clusterName</strong>: cluster name</li>
         * <li><strong>image</strong>: image name</li>
         * <li><strong>imageRepoName</strong>: image repository name</li>
         * <li><strong>imageRepoNamespace</strong>: image repository namespace</li>
         * <li><strong>imageRepoTag</strong>: image tag</li>
         * <li><strong>imageDigest</strong>: image digest.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>appName</p>
         */
        public Builder containerFieldName(String containerFieldName) {
            this.putQueryParameter("ContainerFieldName", containerFieldName);
            this.containerFieldName = containerFieldName;
            return this;
        }

        /**
         * <p>The value that corresponds to <strong>ContainerFieldName</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>cc914b0df156d40148412afe4a581****</p>
         */
        public Builder containerFieldValue(String containerFieldValue) {
            this.putQueryParameter("ContainerFieldValue", containerFieldValue);
            this.containerFieldValue = containerFieldValue;
            return this;
        }

        /**
         * <p>The page number of the first page to display in the query results. Default value: <strong>1</strong>, which indicates that the results start from page 1.</p>
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
         * <p>The CVE ID.</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeVulListPage~~">DescribeVulListPage</a> operation to obtain this parameter.</p>
         * </blockquote>
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
         * <p>Specifies whether the vulnerability is handled. Valid values:</p>
         * <ul>
         * <li><strong>y</strong>: handled</li>
         * <li><strong>n</strong>: not handled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>n</p>
         */
        public Builder dealed(String dealed) {
            this.putQueryParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * <p>The ID of the asset group.</p>
         * 
         * <strong>example:</strong>
         * <p>235454</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The language type of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
         * <p>The priority of the vulnerability fix to query. Separate multiple priorities with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>asap</strong>: high</li>
         * <li><strong>later</strong>: medium</li>
         * <li><strong>nntf</strong>: low.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asap,later,nntf</p>
         */
        public Builder necessity(String necessity) {
            this.putQueryParameter("Necessity", necessity);
            this.necessity = necessity;
            return this;
        }

        /**
         * <p>The number of vulnerability entries per page in a paged query. Default value: 10, which indicates that 10 vulnerability entries are displayed per page.</p>
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
         * <p>Specifies whether Runtime Application Self-Protection (RASP) supports real-time protection against the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not supported.</li>
         * <li><strong>1</strong>: Supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder raspDefend(Integer raspDefend) {
            this.putQueryParameter("RaspDefend", raspDefend);
            this.raspDefend = raspDefend;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account that is added as one of the member accounts in a resource folder.</p>
         * <blockquote>
         * <p>Invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The label used for filtering. Valid values:</p>
         * <ul>
         * <li><strong>Restart required</strong></li>
         * <li><strong>Remote utilization</strong></li>
         * <li><strong>EXP exists</strong></li>
         * <li><strong>Available</strong></li>
         * <li><strong>Privilege escalation</strong></li>
         * <li><strong>Code execution</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Code Execution</p>
         */
        public Builder searchTags(String searchTags) {
            this.putQueryParameter("SearchTags", searchTags);
            this.searchTags = searchTags;
            return this;
        }

        /**
         * <p>The container query type. Valid values:</p>
         * <ul>
         * <li><strong>containerId</strong>: container ID</li>
         * <li><strong>uuid</strong>: asset ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>containerId</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The type of the vulnerability to query. Default value: cve. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerability</li>
         * <li><strong>sys</strong>: Windows system vulnerability</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability</li>
         * <li><strong>app</strong>: application vulnerability (network scan)</li>
         * <li><strong>sca</strong>: application vulnerability (software constituency parsing).</li>
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
         * <p>The UUIDs of the servers to query. Separate multiple UUIDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>d42f938c-d962-48a0-90f9-05e4ea****</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public DescribeGroupedVulRequest build() {
            return new DescribeGroupedVulRequest(this);
        } 

    } 

}
