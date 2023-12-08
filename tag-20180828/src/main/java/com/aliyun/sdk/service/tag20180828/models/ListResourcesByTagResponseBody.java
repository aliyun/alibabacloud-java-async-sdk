// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourcesByTagResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourcesByTagResponseBody</p>
 */
public class ListResourcesByTagResponseBody extends TeaModel {
    @NameInMap("NextToken")
    @Validation(required = true)
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Resources")
    private java.util.List < Resources> resources;

    private ListResourcesByTagResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourcesByTagResponseBody create() {
        return builder().build();
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
     * @return resources
     */
    public java.util.List < Resources> getResources() {
        return this.resources;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < Resources> resources; 

        /**
         * Indicates whether the `next query` is required.
         * <p>
         * 
         * *   If the value of this parameter is empty (`"NextToken": ""`), all results are returned, and the `next query` is not required.
         * *   If the value of this parameter is not empty, the next query is required, and the value is the `token` used to start the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information of the resources.
         */
        public Builder resources(java.util.List < Resources> resources) {
            this.resources = resources;
            return this;
        }

        public ListResourcesByTagResponseBody build() {
            return new ListResourcesByTagResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.category = builder.category;
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
         * @return category
         */
        public String getCategory() {
            return this.category;
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
            private String category; 
            private String key; 
            private String value; 

            /**
             * The type of the tag. Valid values:
             * <p>
             * 
             * *   custom
             * *   system
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
    public static class Resources extends TeaModel {
        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        private Resources(Builder builder) {
            this.resourceId = builder.resourceId;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String resourceId; 
            private java.util.List < Tags> tags; 

            /**
             * The ID of the resource.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The information of the tags.
             * <p>
             * 
             * This parameter is returned only if the `IncludeAllTags` parameter is set to `True`.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
