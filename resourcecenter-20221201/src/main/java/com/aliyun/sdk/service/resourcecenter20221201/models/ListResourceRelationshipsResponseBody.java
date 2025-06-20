// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

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
 * {@link ListResourceRelationshipsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceRelationshipsResponseBody</p>
 */
public class ListResourceRelationshipsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceRelationships")
    private java.util.List<ResourceRelationships> resourceRelationships;

    private ListResourceRelationshipsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.resourceRelationships = builder.resourceRelationships;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceRelationshipsResponseBody create() {
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
     * @return resourceRelationships
     */
    public java.util.List<ResourceRelationships> getResourceRelationships() {
        return this.resourceRelationships;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<ResourceRelationships> resourceRelationships; 

        private Builder() {
        } 

        private Builder(ListResourceRelationshipsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.resourceRelationships = model.resourceRelationships;
        } 

        /**
         * <p>The maximum number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJzZWFyY2hBZnRlcnMiOlsiMTAwMTU2Nzk4MTU1OSJd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>682A3004-38E3-5122-9A11-CCDFAB9C3C4F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource relationships.</p>
         */
        public Builder resourceRelationships(java.util.List<ResourceRelationships> resourceRelationships) {
            this.resourceRelationships = resourceRelationships;
            return this;
        }

        public ListResourceRelationshipsResponseBody build() {
            return new ListResourceRelationshipsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourceRelationshipsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceRelationshipsResponseBody</p>
     */
    public static class ResourceRelationships extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RelatedResourceId")
        private String relatedResourceId;

        @com.aliyun.core.annotation.NameInMap("RelatedResourceRegionId")
        private String relatedResourceRegionId;

        @com.aliyun.core.annotation.NameInMap("RelatedResourceType")
        private String relatedResourceType;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private ResourceRelationships(Builder builder) {
            this.regionId = builder.regionId;
            this.relatedResourceId = builder.relatedResourceId;
            this.relatedResourceRegionId = builder.relatedResourceRegionId;
            this.relatedResourceType = builder.relatedResourceType;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceRelationships create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return relatedResourceId
         */
        public String getRelatedResourceId() {
            return this.relatedResourceId;
        }

        /**
         * @return relatedResourceRegionId
         */
        public String getRelatedResourceRegionId() {
            return this.relatedResourceRegionId;
        }

        /**
         * @return relatedResourceType
         */
        public String getRelatedResourceType() {
            return this.relatedResourceType;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String regionId; 
            private String relatedResourceId; 
            private String relatedResourceRegionId; 
            private String relatedResourceType; 
            private String resourceId; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(ResourceRelationships model) {
                this.regionId = model.regionId;
                this.relatedResourceId = model.relatedResourceId;
                this.relatedResourceRegionId = model.relatedResourceRegionId;
                this.relatedResourceType = model.relatedResourceType;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The region ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the associated resource.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf6m5okksddm6c9lh7***</p>
             */
            public Builder relatedResourceId(String relatedResourceId) {
                this.relatedResourceId = relatedResourceId;
                return this;
            }

            /**
             * <p>The region ID of the associated resource.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder relatedResourceRegionId(String relatedResourceRegionId) {
                this.relatedResourceRegionId = relatedResourceRegionId;
                return this;
            }

            /**
             * <p>The type of the associated resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::VPC::VPC</p>
             */
            public Builder relatedResourceType(String relatedResourceType) {
                this.relatedResourceType = relatedResourceType;
                return this;
            }

            /**
             * <p>The ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>m-eb3hji****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::ACK::Cluster</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ResourceRelationships build() {
                return new ResourceRelationships(this);
            } 

        } 

    }
}
