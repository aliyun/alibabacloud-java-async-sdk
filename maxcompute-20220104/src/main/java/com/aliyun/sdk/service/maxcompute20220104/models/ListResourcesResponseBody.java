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
        @NameInMap("creationTime")
        private Long creationTime;

        @NameInMap("name")
        private String name;

        @NameInMap("owner")
        private String owner;

        @NameInMap("schema")
        private String schema;

        @NameInMap("type")
        private String type;

        private Resources(Builder builder) {
            this.creationTime = builder.creationTime;
            this.name = builder.name;
            this.owner = builder.owner;
            this.schema = builder.schema;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public Long getCreationTime() {
            return this.creationTime;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long creationTime; 
            private String name; 
            private String owner; 
            private String schema; 
            private String type; 

            /**
             * The time when the resource was created.
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
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
