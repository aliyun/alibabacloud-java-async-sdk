// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link ListInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListInstancesRequest</p>
 */
public class ListInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("catalog")
    private String catalog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataSourceType")
    private String dataSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("database")
    private String database;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("edition")
    private String edition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("table")
    private String table;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

    private ListInstancesRequest(Builder builder) {
        super(builder);
        this.catalog = builder.catalog;
        this.dataSourceType = builder.dataSourceType;
        this.database = builder.database;
        this.description = builder.description;
        this.edition = builder.edition;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.table = builder.table;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalog
     */
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return edition
     */
    public String getEdition() {
        return this.edition;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return table
     */
    public String getTable() {
        return this.table;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListInstancesRequest, Builder> {
        private String catalog; 
        private String dataSourceType; 
        private String database; 
        private String description; 
        private String edition; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 
        private String table; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(ListInstancesRequest request) {
            super(request);
            this.catalog = request.catalog;
            this.dataSourceType = request.dataSourceType;
            this.database = request.database;
            this.description = request.description;
            this.edition = request.edition;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
            this.table = request.table;
            this.tags = request.tags;
        } 

        /**
         * catalog.
         */
        public Builder catalog(String catalog) {
            this.putQueryParameter("catalog", catalog);
            this.catalog = catalog;
            return this;
        }

        /**
         * dataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putQueryParameter("dataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * database.
         */
        public Builder database(String database) {
            this.putQueryParameter("database", database);
            this.database = database;
            return this;
        }

        /**
         * <p>The description of the instance. You can use this description to filter instances. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Havenask instance</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The instance type. Valid values: vector: OpenSearch Vector Search Edition instance. engine: OpenSearch Retrieval Engine Edition instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vector</p>
         */
        public Builder edition(String edition) {
            this.putQueryParameter("edition", edition);
            this.edition = edition;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-83570439y0n</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: 1 to 50. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzgpiswzbksdi</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * table.
         */
        public Builder table(String table) {
            this.putQueryParameter("table", table);
            this.table = table;
            return this;
        }

        /**
         * <p>The tags of the instance.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            String tagsShrink = shrink(tags, "tags", "json");
            this.putQueryParameter("tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public ListInstancesRequest build() {
            return new ListInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListInstancesRequest} extends {@link TeaModel}
     *
     * <p>ListInstancesRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
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

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>backup</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>oboms-disk</p>
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
