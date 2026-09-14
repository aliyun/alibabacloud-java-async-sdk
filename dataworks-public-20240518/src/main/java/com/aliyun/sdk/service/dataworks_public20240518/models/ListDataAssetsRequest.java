// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListDataAssetsRequest} extends {@link RequestModel}
 *
 * <p>ListDataAssetsRequest</p>
 */
public class ListDataAssetsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetDomainId")
    private Long assetDomainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryUuid")
    private String categoryUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataAssetIds")
    private java.util.List<String> dataAssetIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataAssetType")
    private String dataAssetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvType")
    private String envType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private ListDataAssetsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.assetDomainId = builder.assetDomainId;
        this.categoryUuid = builder.categoryUuid;
        this.dataAssetIds = builder.dataAssetIds;
        this.dataAssetType = builder.dataAssetType;
        this.envType = builder.envType;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataAssetsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return assetDomainId
     */
    public Long getAssetDomainId() {
        return this.assetDomainId;
    }

    /**
     * @return categoryUuid
     */
    public String getCategoryUuid() {
        return this.categoryUuid;
    }

    /**
     * @return dataAssetIds
     */
    public java.util.List<String> getDataAssetIds() {
        return this.dataAssetIds;
    }

    /**
     * @return dataAssetType
     */
    public String getDataAssetType() {
        return this.dataAssetType;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListDataAssetsRequest, Builder> {
        private String regionId; 
        private Long assetDomainId; 
        private String categoryUuid; 
        private java.util.List<String> dataAssetIds; 
        private String dataAssetType; 
        private String envType; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(ListDataAssetsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.assetDomainId = request.assetDomainId;
            this.categoryUuid = request.categoryUuid;
            this.dataAssetIds = request.dataAssetIds;
            this.dataAssetType = request.dataAssetType;
            this.envType = request.envType;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.tags = request.tags;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the asset domain.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder assetDomainId(Long assetDomainId) {
            this.putQueryParameter("AssetDomainId", assetDomainId);
            this.assetDomainId = assetDomainId;
            return this;
        }

        /**
         * <p>The ID of the asset category.</p>
         * 
         * <strong>example:</strong>
         * <p>cate-xxxxxxxx</p>
         */
        public Builder categoryUuid(String categoryUuid) {
            this.putQueryParameter("CategoryUuid", categoryUuid);
            this.categoryUuid = categoryUuid;
            return this;
        }

        /**
         * <p>The list of unique data asset IDs.</p>
         */
        public Builder dataAssetIds(java.util.List<String> dataAssetIds) {
            String dataAssetIdsShrink = shrink(dataAssetIds, "DataAssetIds", "json");
            this.putQueryParameter("DataAssetIds", dataAssetIdsShrink);
            this.dataAssetIds = dataAssetIds;
            return this;
        }

        /**
         * <p>The Asset Type of the data asset. Valid values:</p>
         * <ul>
         * <li><p>ACS::DataWorks::Table: data table.</p>
         * </li>
         * <li><p>ACS::DataWorks::Task: scheduling node.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACS::DataWorks::Task</p>
         */
        public Builder dataAssetType(String dataAssetType) {
            this.putQueryParameter("DataAssetType", dataAssetType);
            this.dataAssetType = dataAssetType;
            return this;
        }

        /**
         * <p>The workspace environment to which the data asset belongs. Valid values:</p>
         * <ul>
         * <li>Dev: development environment.</li>
         * <li>Prod: production environment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * <p>The name of the asset. Fuzzy search by name is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>AssetDomainName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
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
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The list of tags associated with data assets. Tags are used as query filters:</p>
         * <ul>
         * <li>Multiple values have an OR relationship. For example, <code>[&quot;key1:v1&quot;, &quot;key2:v1&quot;, &quot;key3:v1&quot;]</code> queries data assets that contain any one of the specified tags.</li>
         * <li>If this parameter is not specified or is left empty, no tag-based filtering is applied.</li>
         * </ul>
         */
        public Builder tags(java.util.List<Tags> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public ListDataAssetsRequest build() {
            return new ListDataAssetsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListDataAssetsRequest} extends {@link TeaModel}
     *
     * <p>ListDataAssetsRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The custom tag key specified by the user.</p>
             * <p>The tag key can be up to 64 characters in length, cannot start with <code>dw:</code>, and supports only letters, digits, and the following special characters: <code>-@#*&lt;&gt;|[]()+=&amp;%$!~</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
