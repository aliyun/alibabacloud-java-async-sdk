// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link ListResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourcesResponseBody</p>
 */
public class ListResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListResourcesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListResourcesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc3b4ae16685836687916212e7850</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListResourcesResponseBody build() {
            return new ListResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourcesResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("contentMD5")
        private String contentMD5;

        @com.aliyun.core.annotation.NameInMap("creationTime")
        private Long creationTime;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("lastModifiedTime")
        private Long lastModifiedTime;

        @com.aliyun.core.annotation.NameInMap("lastUpdator")
        private String lastUpdator;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("schema")
        private String schema;

        @com.aliyun.core.annotation.NameInMap("size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Resources(Builder builder) {
            this.comment = builder.comment;
            this.contentMD5 = builder.contentMD5;
            this.creationTime = builder.creationTime;
            this.displayName = builder.displayName;
            this.lastModifiedTime = builder.lastModifiedTime;
            this.lastUpdator = builder.lastUpdator;
            this.name = builder.name;
            this.owner = builder.owner;
            this.schema = builder.schema;
            this.size = builder.size;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return contentMD5
         */
        public String getContentMD5() {
            return this.contentMD5;
        }

        /**
         * @return creationTime
         */
        public Long getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return lastModifiedTime
         */
        public Long getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        /**
         * @return lastUpdator
         */
        public String getLastUpdator() {
            return this.lastUpdator;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String comment; 
            private String contentMD5; 
            private Long creationTime; 
            private String displayName; 
            private Long lastModifiedTime; 
            private String lastUpdator; 
            private String name; 
            private String owner; 
            private String schema; 
            private Long size; 
            private String type; 

            private Builder() {
            } 

            private Builder(Resources model) {
                this.comment = model.comment;
                this.contentMD5 = model.contentMD5;
                this.creationTime = model.creationTime;
                this.displayName = model.displayName;
                this.lastModifiedTime = model.lastModifiedTime;
                this.lastUpdator = model.lastUpdator;
                this.name = model.name;
                this.owner = model.owner;
                this.schema = model.schema;
                this.size = model.size;
                this.type = model.type;
            } 

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>file</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The Base64-encoded 128-bit MD5 hash value of the HTTP request body.</p>
             * 
             * <strong>example:</strong>
             * <p>MACiECZtnLiNkNS1v5****=1</p>
             */
            public Builder contentMD5(String contentMD5) {
                this.contentMD5 = contentMD5;
                return this;
            }

            /**
             * <p>The time when the resource was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-29T03:34:09Z</p>
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The display name.</p>
             * 
             * <strong>example:</strong>
             * <p>res_1</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The time when the resource was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-18T06:15:05Z</p>
             */
            public Builder lastModifiedTime(Long lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * <p>The user who updated the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN$<a href="mailto:xxx@test.aliyunid.com">xxx@test.aliyunid.com</a></p>
             */
            public Builder lastUpdator(String lastUpdator) {
                this.lastUpdator = lastUpdator;
                return this;
            }

            /**
             * <p>The name of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>res_1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The owner of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>1265860483008101</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The schema to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>schemaA</p>
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * <p>The size of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>file</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>py</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>jar</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>volumefile</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>table</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>file</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourcesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("marker")
        private String marker;

        @com.aliyun.core.annotation.NameInMap("maxItem")
        private Integer maxItem;

        @com.aliyun.core.annotation.NameInMap("resources")
        private java.util.List<Resources> resources;

        private Data(Builder builder) {
            this.marker = builder.marker;
            this.maxItem = builder.maxItem;
            this.resources = builder.resources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return marker
         */
        public String getMarker() {
            return this.marker;
        }

        /**
         * @return maxItem
         */
        public Integer getMaxItem() {
            return this.maxItem;
        }

        /**
         * @return resources
         */
        public java.util.List<Resources> getResources() {
            return this.resources;
        }

        public static final class Builder {
            private String marker; 
            private Integer maxItem; 
            private java.util.List<Resources> resources; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.marker = model.marker;
                this.maxItem = model.maxItem;
                this.resources = model.resources;
            } 

            /**
             * <p>Indicates the marker after which the returned list begins.</p>
             * 
             * <strong>example:</strong>
             * <p>ZmN0X21vbnRoX3Rhb2Jhb19pbmRleCE=</p>
             */
            public Builder marker(String marker) {
                this.marker = marker;
                return this;
            }

            /**
             * <p>The maximum number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxItem(Integer maxItem) {
                this.maxItem = maxItem;
                return this;
            }

            /**
             * <p>The list of resources.</p>
             */
            public Builder resources(java.util.List<Resources> resources) {
                this.resources = resources;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
