// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

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
    private java.util.List<Resources> resources;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Resources> getResources() {
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
        private java.util.List<Resources> resources; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(GetResourcesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.resource = model.resource;
            this.resources = model.resources;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of entries returned. Return result of the List operation.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists. Return result of the List operation.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The specified resource. Return result of the Get operation.</p>
         */
        public Builder resource(Resource resource) {
            this.resource = resource;
            return this;
        }

        /**
         * <p>The resource list. Return result of the List operation.</p>
         */
        public Builder resources(java.util.List<Resources> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * <p>The total number of entries returned. Return result of the List operation.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetResourcesResponseBody build() {
            return new GetResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourcesResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("resourceAttributes")
        private java.util.Map<String, ?> resourceAttributes;

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
        public java.util.Map<String, ?> getResourceAttributes() {
            return this.resourceAttributes;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        public static final class Builder {
            private java.util.Map<String, ?> resourceAttributes; 
            private String resourceId; 

            private Builder() {
            } 

            private Builder(Resource model) {
                this.resourceAttributes = model.resourceAttributes;
                this.resourceId = model.resourceId;
            } 

            /**
             * <p>The resource properties in the JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Status&quot;:&quot;Available&quot;,&quot;Description&quot;:&quot;&quot;,&quot;AccountPrivilege&quot;:&quot;RoleReadWrite&quot;,&quot;InstanceId&quot;:&quot;r-8vbf5abe31c9c4d4&quot;,&quot;RegionId&quot;:&quot;cn-zhangjiakou&quot;,&quot;AccountType&quot;:&quot;Normal&quot;,&quot;TypeInfo&quot;:{},&quot;AccountName&quot;:&quot;cctest&quot;}</p>
             */
            public Builder resourceAttributes(java.util.Map<String, ?> resourceAttributes) {
                this.resourceAttributes = resourceAttributes;
                return this;
            }

            /**
             * <p>The ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>cctest</p>
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
    /**
     * 
     * {@link GetResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourcesResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("resourceAttributes")
        private java.util.Map<String, ?> resourceAttributes;

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
        public java.util.Map<String, ?> getResourceAttributes() {
            return this.resourceAttributes;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        public static final class Builder {
            private java.util.Map<String, ?> resourceAttributes; 
            private String resourceId; 

            private Builder() {
            } 

            private Builder(Resources model) {
                this.resourceAttributes = model.resourceAttributes;
                this.resourceId = model.resourceId;
            } 

            /**
             * <p>The resource properties in the JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Status&quot;:&quot;Available&quot;,&quot;Description&quot;:&quot;&quot;,&quot;AccountPrivilege&quot;:&quot;RoleReadWrite&quot;,&quot;InstanceId&quot;:&quot;r-8vbf5abe31c9c4d4&quot;,&quot;RegionId&quot;:&quot;cn-zhangjiakou&quot;,&quot;AccountType&quot;:&quot;Normal&quot;,&quot;TypeInfo&quot;:{},&quot;AccountName&quot;:&quot;cctest&quot;}</p>
             */
            public Builder resourceAttributes(java.util.Map<String, ?> resourceAttributes) {
                this.resourceAttributes = resourceAttributes;
                return this;
            }

            /**
             * <p>The ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>cctest</p>
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
