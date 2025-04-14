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
 * {@link Table} extends {@link TeaModel}
 *
 * <p>Table</p>
 */
public class Table extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BusinessMetadata")
    private BusinessMetadata businessMetadata;

    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private Long modifyTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("ParentMetaEntityId")
    private String parentMetaEntityId;

    @com.aliyun.core.annotation.NameInMap("PartitionKeys")
    private java.util.List<String> partitionKeys;

    @com.aliyun.core.annotation.NameInMap("TableType")
    private String tableType;

    @com.aliyun.core.annotation.NameInMap("TechnicalMetadata")
    private TechnicalMetadata technicalMetadata;

    private Table(Builder builder) {
        this.businessMetadata = builder.businessMetadata;
        this.comment = builder.comment;
        this.createTime = builder.createTime;
        this.id = builder.id;
        this.modifyTime = builder.modifyTime;
        this.name = builder.name;
        this.parentMetaEntityId = builder.parentMetaEntityId;
        this.partitionKeys = builder.partitionKeys;
        this.tableType = builder.tableType;
        this.technicalMetadata = builder.technicalMetadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Table create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessMetadata
     */
    public BusinessMetadata getBusinessMetadata() {
        return this.businessMetadata;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return modifyTime
     */
    public Long getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentMetaEntityId
     */
    public String getParentMetaEntityId() {
        return this.parentMetaEntityId;
    }

    /**
     * @return partitionKeys
     */
    public java.util.List<String> getPartitionKeys() {
        return this.partitionKeys;
    }

    /**
     * @return tableType
     */
    public String getTableType() {
        return this.tableType;
    }

    /**
     * @return technicalMetadata
     */
    public TechnicalMetadata getTechnicalMetadata() {
        return this.technicalMetadata;
    }

    public static final class Builder {
        private BusinessMetadata businessMetadata; 
        private String comment; 
        private Long createTime; 
        private String id; 
        private Long modifyTime; 
        private String name; 
        private String parentMetaEntityId; 
        private java.util.List<String> partitionKeys; 
        private String tableType; 
        private TechnicalMetadata technicalMetadata; 

        private Builder() {
        } 

        private Builder(Table model) {
            this.businessMetadata = model.businessMetadata;
            this.comment = model.comment;
            this.createTime = model.createTime;
            this.id = model.id;
            this.modifyTime = model.modifyTime;
            this.name = model.name;
            this.parentMetaEntityId = model.parentMetaEntityId;
            this.partitionKeys = model.partitionKeys;
            this.tableType = model.tableType;
            this.technicalMetadata = model.technicalMetadata;
        } 

        /**
         * BusinessMetadata.
         */
        public Builder businessMetadata(BusinessMetadata businessMetadata) {
            this.businessMetadata = businessMetadata;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * ModifyTime.
         */
        public Builder modifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * ParentMetaEntityId.
         */
        public Builder parentMetaEntityId(String parentMetaEntityId) {
            this.parentMetaEntityId = parentMetaEntityId;
            return this;
        }

        /**
         * PartitionKeys.
         */
        public Builder partitionKeys(java.util.List<String> partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }

        /**
         * TableType.
         */
        public Builder tableType(String tableType) {
            this.tableType = tableType;
            return this;
        }

        /**
         * TechnicalMetadata.
         */
        public Builder technicalMetadata(TechnicalMetadata technicalMetadata) {
            this.technicalMetadata = technicalMetadata;
            return this;
        }

        public Table build() {
            return new Table(this);
        } 

    } 

    /**
     * 
     * {@link Table} extends {@link TeaModel}
     *
     * <p>Table</p>
     */
    public static class Categories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        private Categories(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.parentId = builder.parentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Categories create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private String parentId; 

            private Builder() {
            } 

            private Builder(Categories model) {
                this.id = model.id;
                this.name = model.name;
                this.parentId = model.parentId;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            public Categories build() {
                return new Categories(this);
            } 

        } 

    }
    /**
     * 
     * {@link Table} extends {@link TeaModel}
     *
     * <p>Table</p>
     */
    public static class Extension extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("FavorCount")
        private Long favorCount;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ReadCount")
        private Long readCount;

        @com.aliyun.core.annotation.NameInMap("ViewCount")
        private Long viewCount;

        private Extension(Builder builder) {
            this.envType = builder.envType;
            this.favorCount = builder.favorCount;
            this.projectId = builder.projectId;
            this.readCount = builder.readCount;
            this.viewCount = builder.viewCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extension create() {
            return builder().build();
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return favorCount
         */
        public Long getFavorCount() {
            return this.favorCount;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return readCount
         */
        public Long getReadCount() {
            return this.readCount;
        }

        /**
         * @return viewCount
         */
        public Long getViewCount() {
            return this.viewCount;
        }

        public static final class Builder {
            private String envType; 
            private Long favorCount; 
            private Long projectId; 
            private Long readCount; 
            private Long viewCount; 

            private Builder() {
            } 

            private Builder(Extension model) {
                this.envType = model.envType;
                this.favorCount = model.favorCount;
                this.projectId = model.projectId;
                this.readCount = model.readCount;
                this.viewCount = model.viewCount;
            } 

            /**
             * EnvType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * FavorCount.
             */
            public Builder favorCount(Long favorCount) {
                this.favorCount = favorCount;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ReadCount.
             */
            public Builder readCount(Long readCount) {
                this.readCount = readCount;
                return this;
            }

            /**
             * ViewCount.
             */
            public Builder viewCount(Long viewCount) {
                this.viewCount = viewCount;
                return this;
            }

            public Extension build() {
                return new Extension(this);
            } 

        } 

    }
    /**
     * 
     * {@link Table} extends {@link TeaModel}
     *
     * <p>Table</p>
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
     * {@link Table} extends {@link TeaModel}
     *
     * <p>Table</p>
     */
    public static class UpstreamTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private UpstreamTasks(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpstreamTasks create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long id; 
            private String name; 

            private Builder() {
            } 

            private Builder(UpstreamTasks model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public UpstreamTasks build() {
                return new UpstreamTasks(this);
            } 

        } 

    }
    /**
     * 
     * {@link Table} extends {@link TeaModel}
     *
     * <p>Table</p>
     */
    public static class BusinessMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Categories")
        private java.util.List<java.util.List<Categories>> categories;

        @com.aliyun.core.annotation.NameInMap("Extension")
        private Extension extension;

        @com.aliyun.core.annotation.NameInMap("Readme")
        private String readme;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UpstreamTasks")
        private java.util.List<UpstreamTasks> upstreamTasks;

        private BusinessMetadata(Builder builder) {
            this.categories = builder.categories;
            this.extension = builder.extension;
            this.readme = builder.readme;
            this.tags = builder.tags;
            this.upstreamTasks = builder.upstreamTasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BusinessMetadata create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List<java.util.List<Categories>> getCategories() {
            return this.categories;
        }

        /**
         * @return extension
         */
        public Extension getExtension() {
            return this.extension;
        }

        /**
         * @return readme
         */
        public String getReadme() {
            return this.readme;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return upstreamTasks
         */
        public java.util.List<UpstreamTasks> getUpstreamTasks() {
            return this.upstreamTasks;
        }

        public static final class Builder {
            private java.util.List<java.util.List<Categories>> categories; 
            private Extension extension; 
            private String readme; 
            private java.util.List<Tags> tags; 
            private java.util.List<UpstreamTasks> upstreamTasks; 

            private Builder() {
            } 

            private Builder(BusinessMetadata model) {
                this.categories = model.categories;
                this.extension = model.extension;
                this.readme = model.readme;
                this.tags = model.tags;
                this.upstreamTasks = model.upstreamTasks;
            } 

            /**
             * Categories.
             */
            public Builder categories(java.util.List<java.util.List<Categories>> categories) {
                this.categories = categories;
                return this;
            }

            /**
             * Extension.
             */
            public Builder extension(Extension extension) {
                this.extension = extension;
                return this;
            }

            /**
             * Readme.
             */
            public Builder readme(String readme) {
                this.readme = readme;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * UpstreamTasks.
             */
            public Builder upstreamTasks(java.util.List<UpstreamTasks> upstreamTasks) {
                this.upstreamTasks = upstreamTasks;
                return this;
            }

            public BusinessMetadata build() {
                return new BusinessMetadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link Table} extends {@link TeaModel}
     *
     * <p>Table</p>
     */
    public static class TechnicalMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Compressed")
        private Boolean compressed;

        @com.aliyun.core.annotation.NameInMap("InputFormat")
        private String inputFormat;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("OutputFormat")
        private String outputFormat;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.Map<String, String> parameters;

        @com.aliyun.core.annotation.NameInMap("SerializationLibrary")
        private String serializationLibrary;

        private TechnicalMetadata(Builder builder) {
            this.compressed = builder.compressed;
            this.inputFormat = builder.inputFormat;
            this.location = builder.location;
            this.outputFormat = builder.outputFormat;
            this.owner = builder.owner;
            this.parameters = builder.parameters;
            this.serializationLibrary = builder.serializationLibrary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TechnicalMetadata create() {
            return builder().build();
        }

        /**
         * @return compressed
         */
        public Boolean getCompressed() {
            return this.compressed;
        }

        /**
         * @return inputFormat
         */
        public String getInputFormat() {
            return this.inputFormat;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return outputFormat
         */
        public String getOutputFormat() {
            return this.outputFormat;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return parameters
         */
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        /**
         * @return serializationLibrary
         */
        public String getSerializationLibrary() {
            return this.serializationLibrary;
        }

        public static final class Builder {
            private Boolean compressed; 
            private String inputFormat; 
            private String location; 
            private String outputFormat; 
            private String owner; 
            private java.util.Map<String, String> parameters; 
            private String serializationLibrary; 

            private Builder() {
            } 

            private Builder(TechnicalMetadata model) {
                this.compressed = model.compressed;
                this.inputFormat = model.inputFormat;
                this.location = model.location;
                this.outputFormat = model.outputFormat;
                this.owner = model.owner;
                this.parameters = model.parameters;
                this.serializationLibrary = model.serializationLibrary;
            } 

            /**
             * Compressed.
             */
            public Builder compressed(Boolean compressed) {
                this.compressed = compressed;
                return this;
            }

            /**
             * InputFormat.
             */
            public Builder inputFormat(String inputFormat) {
                this.inputFormat = inputFormat;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * OutputFormat.
             */
            public Builder outputFormat(String outputFormat) {
                this.outputFormat = outputFormat;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(java.util.Map<String, String> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * SerializationLibrary.
             */
            public Builder serializationLibrary(String serializationLibrary) {
                this.serializationLibrary = serializationLibrary;
                return this;
            }

            public TechnicalMetadata build() {
                return new TechnicalMetadata(this);
            } 

        } 

    }
}
