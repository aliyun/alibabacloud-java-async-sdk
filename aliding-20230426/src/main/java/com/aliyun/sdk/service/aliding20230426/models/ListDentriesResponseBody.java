// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDentriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDentriesResponseBody</p>
 */
public class ListDentriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("dentries")
    private java.util.List < Dentries> dentries;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private ListDentriesResponseBody(Builder builder) {
        this.dentries = builder.dentries;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDentriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return dentries
     */
    public java.util.List < Dentries> getDentries() {
        return this.dentries;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private java.util.List < Dentries> dentries; 
        private String nextToken; 
        private String requestId; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * dentries.
         */
        public Builder dentries(java.util.List < Dentries> dentries) {
            this.dentries = dentries;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public ListDentriesResponseBody build() {
            return new ListDentriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDentriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDentriesResponseBody</p>
     */
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReadOnly")
        private Boolean readOnly;

        private Properties(Builder builder) {
            this.readOnly = builder.readOnly;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
            return builder().build();
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public static final class Builder {
            private Boolean readOnly; 

            /**
             * ReadOnly.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDentriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDentriesResponseBody</p>
     */
    public static class Thumbnail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private Thumbnail(Builder builder) {
            this.height = builder.height;
            this.url = builder.url;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Thumbnail create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer height; 
            private String url; 
            private Integer width; 

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public Thumbnail build() {
                return new Thumbnail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDentriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDentriesResponseBody</p>
     */
    public static class Dentries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppProperties")
        private java.util.Map < String, java.util.List<DentriesAppPropertiesValue>> appProperties;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("ModifierId")
        private String modifierId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("PartitionType")
        private String partitionType;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private Properties properties;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("SpaceId")
        private String spaceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageDriver")
        private String storageDriver;

        @com.aliyun.core.annotation.NameInMap("Thumbnail")
        private Thumbnail thumbnail;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Long version;

        private Dentries(Builder builder) {
            this.appProperties = builder.appProperties;
            this.createTime = builder.createTime;
            this.creatorId = builder.creatorId;
            this.extension = builder.extension;
            this.id = builder.id;
            this.modifiedTime = builder.modifiedTime;
            this.modifierId = builder.modifierId;
            this.name = builder.name;
            this.parentId = builder.parentId;
            this.partitionType = builder.partitionType;
            this.path = builder.path;
            this.properties = builder.properties;
            this.size = builder.size;
            this.spaceId = builder.spaceId;
            this.status = builder.status;
            this.storageDriver = builder.storageDriver;
            this.thumbnail = builder.thumbnail;
            this.type = builder.type;
            this.uuid = builder.uuid;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dentries create() {
            return builder().build();
        }

        /**
         * @return appProperties
         */
        public java.util.Map < String, java.util.List<DentriesAppPropertiesValue>> getAppProperties() {
            return this.appProperties;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return modifierId
         */
        public String getModifierId() {
            return this.modifierId;
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

        /**
         * @return partitionType
         */
        public String getPartitionType() {
            return this.partitionType;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return properties
         */
        public Properties getProperties() {
            return this.properties;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return spaceId
         */
        public String getSpaceId() {
            return this.spaceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageDriver
         */
        public String getStorageDriver() {
            return this.storageDriver;
        }

        /**
         * @return thumbnail
         */
        public Thumbnail getThumbnail() {
            return this.thumbnail;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private java.util.Map < String, java.util.List<DentriesAppPropertiesValue>> appProperties; 
            private String createTime; 
            private String creatorId; 
            private String extension; 
            private String id; 
            private String modifiedTime; 
            private String modifierId; 
            private String name; 
            private String parentId; 
            private String partitionType; 
            private String path; 
            private Properties properties; 
            private Long size; 
            private String spaceId; 
            private String status; 
            private String storageDriver; 
            private Thumbnail thumbnail; 
            private String type; 
            private String uuid; 
            private Long version; 

            /**
             * AppProperties.
             */
            public Builder appProperties(java.util.Map < String, java.util.List<DentriesAppPropertiesValue>> appProperties) {
                this.appProperties = appProperties;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * Extension.
             */
            public Builder extension(String extension) {
                this.extension = extension;
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
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * ModifierId.
             */
            public Builder modifierId(String modifierId) {
                this.modifierId = modifierId;
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

            /**
             * PartitionType.
             */
            public Builder partitionType(String partitionType) {
                this.partitionType = partitionType;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(Properties properties) {
                this.properties = properties;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * SpaceId.
             */
            public Builder spaceId(String spaceId) {
                this.spaceId = spaceId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StorageDriver.
             */
            public Builder storageDriver(String storageDriver) {
                this.storageDriver = storageDriver;
                return this;
            }

            /**
             * Thumbnail.
             */
            public Builder thumbnail(Thumbnail thumbnail) {
                this.thumbnail = thumbnail;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public Dentries build() {
                return new Dentries(this);
            } 

        } 

    }
}
