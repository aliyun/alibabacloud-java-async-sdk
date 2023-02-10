// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupedVulRequest} extends {@link RequestModel}
 *
 * <p>DescribeGroupedVulRequest</p>
 */
public class DescribeGroupedVulRequest extends Request {
    @Query
    @NameInMap("AliasName")
    private String aliasName;

    @Query
    @NameInMap("AssetType")
    private String assetType;

    @Query
    @NameInMap("AttachTypes")
    private String attachTypes;

    @Query
    @NameInMap("ContainerFieldName")
    private String containerFieldName;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Dealed")
    private String dealed;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Necessity")
    private String necessity;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SearchTags")
    private String searchTags;

    @Query
    @NameInMap("TargetType")
    private String targetType;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("Uuids")
    private String uuids;

    private DescribeGroupedVulRequest(Builder builder) {
        super(builder);
        this.aliasName = builder.aliasName;
        this.assetType = builder.assetType;
        this.attachTypes = builder.attachTypes;
        this.containerFieldName = builder.containerFieldName;
        this.currentPage = builder.currentPage;
        this.dealed = builder.dealed;
        this.groupId = builder.groupId;
        this.lang = builder.lang;
        this.necessity = builder.necessity;
        this.pageSize = builder.pageSize;
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
     * @return containerFieldName
     */
    public String getContainerFieldName() {
        return this.containerFieldName;
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
        private String containerFieldName; 
        private Integer currentPage; 
        private String dealed; 
        private String groupId; 
        private String lang; 
        private String necessity; 
        private Integer pageSize; 
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
            this.containerFieldName = request.containerFieldName;
            this.currentPage = request.currentPage;
            this.dealed = request.dealed;
            this.groupId = request.groupId;
            this.lang = request.lang;
            this.necessity = request.necessity;
            this.pageSize = request.pageSize;
            this.searchTags = request.searchTags;
            this.targetType = request.targetType;
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
         * AssetType.
         */
        public Builder assetType(String assetType) {
            this.putQueryParameter("AssetType", assetType);
            this.assetType = assetType;
            return this;
        }

        /**
         * The type of the vulnerability.
         * <p>
         * 
         * >  This parameter is valid only for application vulnerabilities and vulnerabilities that are detected based on software component analysis.
         */
        public Builder attachTypes(String attachTypes) {
            this.putQueryParameter("AttachTypes", attachTypes);
            this.attachTypes = attachTypes;
            return this;
        }

        /**
         * ContainerFieldName.
         */
        public Builder containerFieldName(String containerFieldName) {
            this.putQueryParameter("ContainerFieldName", containerFieldName);
            this.containerFieldName = containerFieldName;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
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
         * **y**: yes **n**: no
         */
        public Builder dealed(String dealed) {
            this.putQueryParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * The ID of the asset group.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
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
         * The priority to fix the vulnerability. Separate multiple priorities with commas (,). Valid values:
         * <p>
         * 
         * *   **asap**: high
         * *   **later**: medium
         * *   **nntf**: low
         */
        public Builder necessity(String necessity) {
            this.putQueryParameter("Necessity", necessity);
            this.necessity = necessity;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The tag that is used to filter vulnerabilities. Valid values:
         * <p>
         * 
         * *   Restart required
         * *   Remote exploitation
         * *   Exploit exists
         * *   Exploitable
         * *   Privilege escalation
         * *   Code execution
         */
        public Builder searchTags(String searchTags) {
            this.putQueryParameter("SearchTags", searchTags);
            this.searchTags = searchTags;
            return this;
        }

        /**
         * TargetType.
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * The type of the vulnerability. Valid values:
         * <p>
         * 
         * *   **cve**: Linux software vulnerability
         * *   **sys**: Windows system vulnerability
         * *   **cms**: Web-CMS vulnerability
         * *   **app**: application vulnerability
         * *   **emg**: urgent vulnerability
         * *   **sca**: vulnerability that is detected based on software component analysis
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The UUIDs of the servers. Separate multiple UUIDs with commas (,).
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
