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
 * {@link ExportVulRequest} extends {@link RequestModel}
 *
 * <p>ExportVulRequest</p>
 */
public class ExportVulRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ContainerName")
    private String containerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTsEnd")
    private Long createTsEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTsStart")
    private Long createTsStart;

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
    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Necessity")
    private String necessity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

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
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private String uuids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcInstanceIds")
    private String vpcInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VulEntityList")
    private java.util.List<VulEntityList> vulEntityList;

    private ExportVulRequest(Builder builder) {
        super(builder);
        this.aliasName = builder.aliasName;
        this.assetType = builder.assetType;
        this.attachTypes = builder.attachTypes;
        this.containerName = builder.containerName;
        this.createTsEnd = builder.createTsEnd;
        this.createTsStart = builder.createTsStart;
        this.cveId = builder.cveId;
        this.dealed = builder.dealed;
        this.groupId = builder.groupId;
        this.imageName = builder.imageName;
        this.lang = builder.lang;
        this.necessity = builder.necessity;
        this.path = builder.path;
        this.raspDefend = builder.raspDefend;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.searchTags = builder.searchTags;
        this.type = builder.type;
        this.uuids = builder.uuids;
        this.vpcInstanceIds = builder.vpcInstanceIds;
        this.vulEntityList = builder.vulEntityList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportVulRequest create() {
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
     * @return containerName
     */
    public String getContainerName() {
        return this.containerName;
    }

    /**
     * @return createTsEnd
     */
    public Long getCreateTsEnd() {
        return this.createTsEnd;
    }

    /**
     * @return createTsStart
     */
    public Long getCreateTsStart() {
        return this.createTsStart;
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
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
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
     * @return path
     */
    public String getPath() {
        return this.path;
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

    /**
     * @return vpcInstanceIds
     */
    public String getVpcInstanceIds() {
        return this.vpcInstanceIds;
    }

    /**
     * @return vulEntityList
     */
    public java.util.List<VulEntityList> getVulEntityList() {
        return this.vulEntityList;
    }

    public static final class Builder extends Request.Builder<ExportVulRequest, Builder> {
        private String aliasName; 
        private String assetType; 
        private String attachTypes; 
        private String containerName; 
        private Long createTsEnd; 
        private Long createTsStart; 
        private String cveId; 
        private String dealed; 
        private String groupId; 
        private String imageName; 
        private String lang; 
        private String necessity; 
        private String path; 
        private Integer raspDefend; 
        private Long resourceDirectoryAccountId; 
        private String searchTags; 
        private String type; 
        private String uuids; 
        private String vpcInstanceIds; 
        private java.util.List<VulEntityList> vulEntityList; 

        private Builder() {
            super();
        } 

        private Builder(ExportVulRequest request) {
            super(request);
            this.aliasName = request.aliasName;
            this.assetType = request.assetType;
            this.attachTypes = request.attachTypes;
            this.containerName = request.containerName;
            this.createTsEnd = request.createTsEnd;
            this.createTsStart = request.createTsStart;
            this.cveId = request.cveId;
            this.dealed = request.dealed;
            this.groupId = request.groupId;
            this.imageName = request.imageName;
            this.lang = request.lang;
            this.necessity = request.necessity;
            this.path = request.path;
            this.raspDefend = request.raspDefend;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.searchTags = request.searchTags;
            this.type = request.type;
            this.uuids = request.uuids;
            this.vpcInstanceIds = request.vpcInstanceIds;
            this.vulEntityList = request.vulEntityList;
        } 

        /**
         * <p>The name of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>RHSA-2019:3197-Important: sudo security update</p>
         */
        public Builder aliasName(String aliasName) {
            this.putQueryParameter("AliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * <p>The asset type where the vulnerability is detected. Separate multiple types with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>ECS</strong>: host asset</li>
         * <li><strong>CONTAINER</strong>: container asset</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder assetType(String assetType) {
            this.putQueryParameter("AssetType", assetType);
            this.assetType = assetType;
            return this;
        }

        /**
         * <p>The additional vulnerability type when querying application vulnerabilities. This parameter is required when Type is set to app. The value is fixed as <strong>sca</strong>.</p>
         * <blockquote>
         * <p>If this parameter is set to <strong>sca</strong>, both application vulnerabilities (<strong>app</strong> type) and software composition analysis (<strong>sca</strong> type) vulnerabilities are queried. If this parameter is not set, only application vulnerabilities are queried.</p>
         * </blockquote>
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
         * <p>The name of the container affected by the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-7b87597b99-mcskr</p>
         */
        public Builder containerName(String containerName) {
            this.putQueryParameter("ContainerName", containerName);
            this.containerName = containerName;
            return this;
        }

        /**
         * <p>The end of the time range during which the first scan was performed.</p>
         * <blockquote>
         * <p>The value is a UNIX timestamp. Unit: milliseconds.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1696186800000</p>
         */
        public Builder createTsEnd(Long createTsEnd) {
            this.putQueryParameter("CreateTsEnd", createTsEnd);
            this.createTsEnd = createTsEnd;
            return this;
        }

        /**
         * <p>The start of the time range during which the first scan was performed.</p>
         * <blockquote>
         * <p>The value is a UNIX timestamp. Unit: milliseconds.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1696128144000</p>
         */
        public Builder createTsStart(Long createTsStart) {
            this.putQueryParameter("CreateTsStart", createTsStart);
            this.createTsStart = createTsStart;
            return this;
        }

        /**
         * <p>The CVE ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2022-44702</p>
         */
        public Builder cveId(String cveId) {
            this.putQueryParameter("CveId", cveId);
            this.cveId = cveId;
            return this;
        }

        /**
         * <p>Specifies whether the vulnerability is fixed. Valid values:</p>
         * <ul>
         * <li><strong>y</strong>: fixed</li>
         * <li><strong>n</strong>: not fixed</li>
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
         * <p>The ID of the asset group to which the server with the vulnerability belongs.</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8834224</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name of the image affected by the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>container-<em><strong>:</strong></em>*</p>
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
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
         * <p>The priority of the vulnerability to query. Separate multiple priorities with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>asap</strong>: high</li>
         * <li><strong>later</strong>: medium</li>
         * <li><strong>nntf</strong>: low</li>
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
         * <p>The path of the process affected by the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>/etc/test</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>Specifies whether runtime application self-protection (RASP) supports real-time protection against the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not supported.</li>
         * <li><strong>1</strong>: Supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder raspDefend(Integer raspDefend) {
            this.putQueryParameter("RaspDefend", raspDefend);
            this.raspDefend = raspDefend;
            return this;
        }

        /**
         * <p>The ID of the resource directory account.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>Filters results by label. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>Restart required</li>
         * <li>Remote utilization</li>
         * <li>EXP exists</li>
         * <li>Exploitable</li>
         * <li>Privilege escalation</li>
         * <li>Code execution</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li><strong>Restart required</strong></li>
         * <li><strong>Remote utilization</strong></li>
         * <li><strong>EXP exists</strong></li>
         * <li><strong>Available</strong></li>
         * <li><strong>Elevation of Privilege</strong></li>
         * <li><strong>Code Execution</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Restart required</p>
         */
        public Builder searchTags(String searchTags) {
            this.putQueryParameter("SearchTags", searchTags);
            this.searchTags = searchTags;
            return this;
        }

        /**
         * <p>The type of vulnerabilities to export. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerability</li>
         * <li><strong>sys</strong>: Windows system vulnerability</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability</li>
         * <li><strong>app</strong>: application vulnerability</li>
         * <li><strong>emg</strong>: emergency vulnerability</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The UUIDs of the servers to query for vulnerabilities. Separate multiple UUIDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>1587bedb-fdb4-48c4-9330-****</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        /**
         * <p>The instance IDs of the VPC-connected instances to query for vulnerabilities. Separate multiple IDs with commas (,).</p>
         * <blockquote>
         * <p>Invoke the <a href="~~DescribeVpcList~~">DescribeVpcList</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ins-133****,ins-5414****</p>
         */
        public Builder vpcInstanceIds(String vpcInstanceIds) {
            this.putQueryParameter("VpcInstanceIds", vpcInstanceIds);
            this.vpcInstanceIds = vpcInstanceIds;
            return this;
        }

        /**
         * <p>The list of vulnerability component information.</p>
         */
        public Builder vulEntityList(java.util.List<VulEntityList> vulEntityList) {
            this.putQueryParameter("VulEntityList", vulEntityList);
            this.vulEntityList = vulEntityList;
            return this;
        }

        @Override
        public ExportVulRequest build() {
            return new ExportVulRequest(this);
        } 

    } 

    /**
     * 
     * {@link ExportVulRequest} extends {@link TeaModel}
     *
     * <p>ExportVulRequest</p>
     */
    public static class VulEntityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityName")
        private String entityName;

        @com.aliyun.core.annotation.NameInMap("EntityVersion")
        private String entityVersion;

        private VulEntityList(Builder builder) {
            this.entityName = builder.entityName;
            this.entityVersion = builder.entityVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VulEntityList create() {
            return builder().build();
        }

        /**
         * @return entityName
         */
        public String getEntityName() {
            return this.entityName;
        }

        /**
         * @return entityVersion
         */
        public String getEntityVersion() {
            return this.entityVersion;
        }

        public static final class Builder {
            private String entityName; 
            private String entityVersion; 

            private Builder() {
            } 

            private Builder(VulEntityList model) {
                this.entityName = model.entityName;
                this.entityVersion = model.entityVersion;
            } 

            /**
             * <p>The name of the component.</p>
             * 
             * <strong>example:</strong>
             * <p>Ollama</p>
             */
            public Builder entityName(String entityName) {
                this.entityName = entityName;
                return this;
            }

            /**
             * <p>The version of the component.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder entityVersion(String entityVersion) {
                this.entityVersion = entityVersion;
                return this;
            }

            public VulEntityList build() {
                return new VulEntityList(this);
            } 

        } 

    }
}
