// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourcesResponseBody</p>
 */
public class ListResourcesResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
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

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListResourcesResponseBody build() {
            return new ListResourcesResponseBody(this);
        } 

    } 

    public static class Resources extends TeaModel {
        @NameInMap("comment")
        private String comment;

        @NameInMap("contentMD5")
        private String contentMD5;

        @NameInMap("creationTime")
        private Long creationTime;

        @NameInMap("displayName")
        private String displayName;

        @NameInMap("lastModifiedTime")
        private Long lastModifiedTime;

        @NameInMap("lastUpdator")
        private String lastUpdator;

        @NameInMap("name")
        private String name;

        @NameInMap("owner")
        private String owner;

        @NameInMap("schema")
        private String schema;

        @NameInMap("size")
        private Long size;

        @NameInMap("type")
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

            /**
             * comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * contentMD5.
             */
            public Builder contentMD5(String contentMD5) {
                this.contentMD5 = contentMD5;
                return this;
            }

            /**
             * The time when the resource was created.
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * displayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * lastModifiedTime.
             */
            public Builder lastModifiedTime(Long lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * lastUpdator.
             */
            public Builder lastUpdator(String lastUpdator) {
                this.lastUpdator = lastUpdator;
                return this;
            }

            /**
             * The name of the resource.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The owner of the resource.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The schema of the resource.
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The type of the resource.
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
    public static class Data extends TeaModel {
        @NameInMap("marker")
        private String marker;

        @NameInMap("maxItem")
        private Integer maxItem;

        @NameInMap("resources")
        private java.util.List < Resources> resources;

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
        public java.util.List < Resources> getResources() {
            return this.resources;
        }

        public static final class Builder {
            private String marker; 
            private Integer maxItem; 
            private java.util.List < Resources> resources; 

            /**
             * Indicates the marker after which the returned list begins.
             */
            public Builder marker(String marker) {
                this.marker = marker;
                return this;
            }

            /**
             * The maximum number of entries returned per page.
             */
            public Builder maxItem(Integer maxItem) {
                this.maxItem = maxItem;
                return this;
            }

            /**
             * The list of resources.
             */
            public Builder resources(java.util.List < Resources> resources) {
                this.resources = resources;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
