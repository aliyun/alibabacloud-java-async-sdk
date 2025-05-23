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
    @com.aliyun.core.annotation.NameInMap("DataAssetIds")
    private java.util.List<String> dataAssetIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataAssetType")
    private String dataAssetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvType")
    private String envType;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Tags> tags;

    private ListDataAssetsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataAssetIds = builder.dataAssetIds;
        this.dataAssetType = builder.dataAssetType;
        this.envType = builder.envType;
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
        private java.util.List<String> dataAssetIds; 
        private String dataAssetType; 
        private String envType; 
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
            this.dataAssetIds = request.dataAssetIds;
            this.dataAssetType = request.dataAssetType;
            this.envType = request.envType;
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
         * <p>The data asset IDs.</p>
         */
        public Builder dataAssetIds(java.util.List<String> dataAssetIds) {
            String dataAssetIdsShrink = shrink(dataAssetIds, "DataAssetIds", "json");
            this.putQueryParameter("DataAssetIds", dataAssetIdsShrink);
            this.dataAssetIds = dataAssetIds;
            return this;
        }

        /**
         * <p>The type of the data asset. Valid values:</p>
         * <ul>
         * <li>ACS::DataWorks::Table</li>
         * <li>ACS::DataWorks::Task</li>
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
         * <p>The environment of the workspace to which the data asset belongs. Valid values:</p>
         * <ul>
         * <li>Dev: development environment</li>
         * <li>Prod: production environment</li>
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
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
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
         * <p>The DataWorks workspace ID.</p>
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
         * <p>The tags that are added to data assets. This parameter specifies a filter condition.</p>
         * <ul>
         * <li>You can specify multiple tags, which are in the logical OR relation. For example, you can query the data assets that contain one of the following tags: <code>[&quot;key1:v1&quot;, &quot;key2:v1&quot;, &quot;key3:v1&quot;]</code>.</li>
         * <li>If you do not configure this parameter, tag-based filtering is not performed.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The tag key.</p>
             * <p>The tag key can be up to 64 characters in length and can contain letters, digits, and the following characters: <code>-@#*&lt;&gt;|[]()+=&amp;%$!~</code>. It cannot start with <code>dw:</code>.</p>
             * <p>This parameter is required.</p>
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
