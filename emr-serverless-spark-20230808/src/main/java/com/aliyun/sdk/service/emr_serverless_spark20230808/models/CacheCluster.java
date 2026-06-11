// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link CacheCluster} extends {@link TeaModel}
 *
 * <p>CacheCluster</p>
 */
public class CacheCluster extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bindedWorkspaces")
    private java.util.List<String> bindedWorkspaces;

    @com.aliyun.core.annotation.NameInMap("cacheClusterId")
    private String cacheClusterId;

    @com.aliyun.core.annotation.NameInMap("cacheClusterName")
    private String cacheClusterName;

    @com.aliyun.core.annotation.NameInMap("cachesets")
    private java.util.List<Cachesets> cachesets;

    @com.aliyun.core.annotation.NameInMap("clusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("configuration")
    private String configuration;

    @com.aliyun.core.annotation.NameInMap("configurations")
    private java.util.List<Configurations> configurations;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("gmtCreated")
    private Long gmtCreated;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private Long gmtModified;

    @com.aliyun.core.annotation.NameInMap("modifier")
    private String modifier;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("paymentType")
    private String paymentType;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("resourceSpec")
    private ResourceSpec resourceSpec;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.NameInMap("tables")
    private java.util.List<Tables> tables;

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("usedResourceSpec")
    private UsedResourceSpec usedResourceSpec;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private CacheCluster(Builder builder) {
        this.bindedWorkspaces = builder.bindedWorkspaces;
        this.cacheClusterId = builder.cacheClusterId;
        this.cacheClusterName = builder.cacheClusterName;
        this.cachesets = builder.cachesets;
        this.clusterId = builder.clusterId;
        this.configuration = builder.configuration;
        this.configurations = builder.configurations;
        this.createTime = builder.createTime;
        this.creator = builder.creator;
        this.gmtCreated = builder.gmtCreated;
        this.gmtModified = builder.gmtModified;
        this.modifier = builder.modifier;
        this.name = builder.name;
        this.paymentType = builder.paymentType;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceSpec = builder.resourceSpec;
        this.state = builder.state;
        this.tables = builder.tables;
        this.tags = builder.tags;
        this.usedResourceSpec = builder.usedResourceSpec;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CacheCluster create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindedWorkspaces
     */
    public java.util.List<String> getBindedWorkspaces() {
        return this.bindedWorkspaces;
    }

    /**
     * @return cacheClusterId
     */
    public String getCacheClusterId() {
        return this.cacheClusterId;
    }

    /**
     * @return cacheClusterName
     */
    public String getCacheClusterName() {
        return this.cacheClusterName;
    }

    /**
     * @return cachesets
     */
    public java.util.List<Cachesets> getCachesets() {
        return this.cachesets;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return configuration
     */
    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * @return configurations
     */
    public java.util.List<Configurations> getConfigurations() {
        return this.configurations;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return gmtCreated
     */
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * @return gmtModified
     */
    public Long getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return modifier
     */
    public String getModifier() {
        return this.modifier;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceSpec
     */
    public ResourceSpec getResourceSpec() {
        return this.resourceSpec;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return tables
     */
    public java.util.List<Tables> getTables() {
        return this.tables;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return usedResourceSpec
     */
    public UsedResourceSpec getUsedResourceSpec() {
        return this.usedResourceSpec;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private java.util.List<String> bindedWorkspaces; 
        private String cacheClusterId; 
        private String cacheClusterName; 
        private java.util.List<Cachesets> cachesets; 
        private String clusterId; 
        private String configuration; 
        private java.util.List<Configurations> configurations; 
        private String createTime; 
        private String creator; 
        private Long gmtCreated; 
        private Long gmtModified; 
        private String modifier; 
        private String name; 
        private String paymentType; 
        private String regionId; 
        private String resourceGroupId; 
        private ResourceSpec resourceSpec; 
        private String state; 
        private java.util.List<Tables> tables; 
        private java.util.List<Tags> tags; 
        private UsedResourceSpec usedResourceSpec; 
        private String version; 

        private Builder() {
        } 

        private Builder(CacheCluster model) {
            this.bindedWorkspaces = model.bindedWorkspaces;
            this.cacheClusterId = model.cacheClusterId;
            this.cacheClusterName = model.cacheClusterName;
            this.cachesets = model.cachesets;
            this.clusterId = model.clusterId;
            this.configuration = model.configuration;
            this.configurations = model.configurations;
            this.createTime = model.createTime;
            this.creator = model.creator;
            this.gmtCreated = model.gmtCreated;
            this.gmtModified = model.gmtModified;
            this.modifier = model.modifier;
            this.name = model.name;
            this.paymentType = model.paymentType;
            this.regionId = model.regionId;
            this.resourceGroupId = model.resourceGroupId;
            this.resourceSpec = model.resourceSpec;
            this.state = model.state;
            this.tables = model.tables;
            this.tags = model.tags;
            this.usedResourceSpec = model.usedResourceSpec;
            this.version = model.version;
        } 

        /**
         * bindedWorkspaces.
         */
        public Builder bindedWorkspaces(java.util.List<String> bindedWorkspaces) {
            this.bindedWorkspaces = bindedWorkspaces;
            return this;
        }

        /**
         * cacheClusterId.
         */
        public Builder cacheClusterId(String cacheClusterId) {
            this.cacheClusterId = cacheClusterId;
            return this;
        }

        /**
         * cacheClusterName.
         */
        public Builder cacheClusterName(String cacheClusterName) {
            this.cacheClusterName = cacheClusterName;
            return this;
        }

        /**
         * cachesets.
         */
        public Builder cachesets(java.util.List<Cachesets> cachesets) {
            this.cachesets = cachesets;
            return this;
        }

        /**
         * clusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * configuration.
         */
        public Builder configuration(String configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * configurations.
         */
        public Builder configurations(java.util.List<Configurations> configurations) {
            this.configurations = configurations;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * gmtCreated.
         */
        public Builder gmtCreated(Long gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * modifier.
         */
        public Builder modifier(String modifier) {
            this.modifier = modifier;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * paymentType.
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * resourceSpec.
         */
        public Builder resourceSpec(ResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }

        /**
         * state.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * tables.
         */
        public Builder tables(java.util.List<Tables> tables) {
            this.tables = tables;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * usedResourceSpec.
         */
        public Builder usedResourceSpec(UsedResourceSpec usedResourceSpec) {
            this.usedResourceSpec = usedResourceSpec;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public CacheCluster build() {
            return new CacheCluster(this);
        } 

    } 

    /**
     * 
     * {@link CacheCluster} extends {@link TeaModel}
     *
     * <p>CacheCluster</p>
     */
    public static class Cachesets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        private Cachesets(Builder builder) {
            this.name = builder.name;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cachesets create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String name; 
            private String path; 

            private Builder() {
            } 

            private Builder(Cachesets model) {
                this.name = model.name;
                this.path = model.path;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public Cachesets build() {
                return new Cachesets(this);
            } 

        } 

    }
    /**
     * 
     * {@link CacheCluster} extends {@link TeaModel}
     *
     * <p>CacheCluster</p>
     */
    public static class Configurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Configurations(Builder builder) {
            this.content = builder.content;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configurations create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String content; 
            private String name; 

            private Builder() {
            } 

            private Builder(Configurations model) {
                this.content = model.content;
                this.name = model.name;
            } 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Configurations build() {
                return new Configurations(this);
            } 

        } 

    }
    /**
     * 
     * {@link CacheCluster} extends {@link TeaModel}
     *
     * <p>CacheCluster</p>
     */
    public static class ResourceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bandWidth")
        private Long bandWidth;

        @com.aliyun.core.annotation.NameInMap("ha")
        private Boolean ha;

        @com.aliyun.core.annotation.NameInMap("storage")
        private Long storage;

        private ResourceSpec(Builder builder) {
            this.bandWidth = builder.bandWidth;
            this.ha = builder.ha;
            this.storage = builder.storage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceSpec create() {
            return builder().build();
        }

        /**
         * @return bandWidth
         */
        public Long getBandWidth() {
            return this.bandWidth;
        }

        /**
         * @return ha
         */
        public Boolean getHa() {
            return this.ha;
        }

        /**
         * @return storage
         */
        public Long getStorage() {
            return this.storage;
        }

        public static final class Builder {
            private Long bandWidth; 
            private Boolean ha; 
            private Long storage; 

            private Builder() {
            } 

            private Builder(ResourceSpec model) {
                this.bandWidth = model.bandWidth;
                this.ha = model.ha;
                this.storage = model.storage;
            } 

            /**
             * bandWidth.
             */
            public Builder bandWidth(Long bandWidth) {
                this.bandWidth = bandWidth;
                return this;
            }

            /**
             * ha.
             */
            public Builder ha(Boolean ha) {
                this.ha = ha;
                return this;
            }

            /**
             * storage.
             */
            public Builder storage(Long storage) {
                this.storage = storage;
                return this;
            }

            public ResourceSpec build() {
                return new ResourceSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link CacheCluster} extends {@link TeaModel}
     *
     * <p>CacheCluster</p>
     */
    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("catalogId")
        private String catalogId;

        @com.aliyun.core.annotation.NameInMap("catalogProvider")
        private String catalogProvider;

        @com.aliyun.core.annotation.NameInMap("database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("table")
        private String table;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Tables(Builder builder) {
            this.catalogId = builder.catalogId;
            this.catalogProvider = builder.catalogProvider;
            this.database = builder.database;
            this.table = builder.table;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return catalogId
         */
        public String getCatalogId() {
            return this.catalogId;
        }

        /**
         * @return catalogProvider
         */
        public String getCatalogProvider() {
            return this.catalogProvider;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String catalogId; 
            private String catalogProvider; 
            private String database; 
            private String table; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Tables model) {
                this.catalogId = model.catalogId;
                this.catalogProvider = model.catalogProvider;
                this.database = model.database;
                this.table = model.table;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * catalogId.
             */
            public Builder catalogId(String catalogId) {
                this.catalogId = catalogId;
                return this;
            }

            /**
             * catalogProvider.
             */
            public Builder catalogProvider(String catalogProvider) {
                this.catalogProvider = catalogProvider;
                return this;
            }

            /**
             * database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * table.
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            /**
             * workspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
    /**
     * 
     * {@link CacheCluster} extends {@link TeaModel}
     *
     * <p>CacheCluster</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
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
    /**
     * 
     * {@link CacheCluster} extends {@link TeaModel}
     *
     * <p>CacheCluster</p>
     */
    public static class UsedResourceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bandWidth")
        private Long bandWidth;

        @com.aliyun.core.annotation.NameInMap("storage")
        private Long storage;

        private UsedResourceSpec(Builder builder) {
            this.bandWidth = builder.bandWidth;
            this.storage = builder.storage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsedResourceSpec create() {
            return builder().build();
        }

        /**
         * @return bandWidth
         */
        public Long getBandWidth() {
            return this.bandWidth;
        }

        /**
         * @return storage
         */
        public Long getStorage() {
            return this.storage;
        }

        public static final class Builder {
            private Long bandWidth; 
            private Long storage; 

            private Builder() {
            } 

            private Builder(UsedResourceSpec model) {
                this.bandWidth = model.bandWidth;
                this.storage = model.storage;
            } 

            /**
             * bandWidth.
             */
            public Builder bandWidth(Long bandWidth) {
                this.bandWidth = bandWidth;
                return this;
            }

            /**
             * storage.
             */
            public Builder storage(Long storage) {
                this.storage = storage;
                return this;
            }

            public UsedResourceSpec build() {
                return new UsedResourceSpec(this);
            } 

        } 

    }
}
