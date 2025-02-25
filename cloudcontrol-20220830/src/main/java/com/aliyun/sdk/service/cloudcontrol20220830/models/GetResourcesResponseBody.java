// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourcesResponseBody</p>
 */
public class GetResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resource")
    private Resource resource;

    @com.aliyun.core.annotation.NameInMap("resources")
    private java.util.List < Resources> resources;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private GetResourcesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.resource = builder.resource;
        this.resources = builder.resources;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
     * @return resource
     */
    public Resource getResource() {
        return this.resource;
    }

    /**
     * @return resources
     */
    public java.util.List < Resources> getResources() {
        return this.resources;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Resource resource; 
        private java.util.List < Resources> resources; 
        private Integer totalCount; 

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * resource.
         */
        public Builder resource(Resource resource) {
            this.resource = resource;
            return this;
        }

        /**
         * resources.
         */
        public Builder resources(java.util.List < Resources> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetResourcesResponseBody build() {
            return new GetResourcesResponseBody(this);
        } 

    } 

    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("resourceAttributes")
        private java.util.Map < String, ? > resourceAttributes;

        @com.aliyun.core.annotation.NameInMap("resourceId")
        private String resourceId;

        private Resource(Builder builder) {
            this.resourceAttributes = builder.resourceAttributes;
            this.resourceId = builder.resourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return resourceAttributes
         */
        public java.util.Map < String, ? > getResourceAttributes() {
            return this.resourceAttributes;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        public static final class Builder {
            private java.util.Map < String, ? > resourceAttributes; 
            private String resourceId; 

            /**
             * resourceAttributes.
             */
            public Builder resourceAttributes(java.util.Map < String, ? > resourceAttributes) {
                this.resourceAttributes = resourceAttributes;
                return this;
            }

            /**
             * resourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("resourceAttributes")
        private java.util.Map < String, ? > resourceAttributes;

        @com.aliyun.core.annotation.NameInMap("resourceId")
        private String resourceId;

        private Resources(Builder builder) {
            this.resourceAttributes = builder.resourceAttributes;
            this.resourceId = builder.resourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return resourceAttributes
         */
        public java.util.Map < String, ? > getResourceAttributes() {
            return this.resourceAttributes;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        public static final class Builder {
            private java.util.Map < String, ? > resourceAttributes; 
            private String resourceId; 

            /**
             * resourceAttributes.
             */
            public Builder resourceAttributes(java.util.Map < String, ? > resourceAttributes) {
                this.resourceAttributes = resourceAttributes;
                return this;
            }

            /**
             * resourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
