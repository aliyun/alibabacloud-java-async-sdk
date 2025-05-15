// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828.models;

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
 * {@link ListTagResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTagResourcesResponseBody</p>
 */
public class ListTagResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagResources")
    private java.util.List<TagResources> tagResources;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListTagResourcesResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.tagResources = builder.tagResources;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
     * @return tagResources
     */
    public java.util.List<TagResources> getTagResources() {
        return this.tagResources;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<TagResources> tagResources; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListTagResourcesResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.tagResources = model.tagResources;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Access denied information</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Next token for the next query. An empty NextToken indicates there are no more results.</p>
         * 
         * <strong>example:</strong>
         * <p>uPZbmbpgxp2/6vNWNPoase3Eqy+gL9pdDBH7KGZXMuZ9GxmBbMJcTP/dlrNqRaWF</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>5514CB39-B7C0-5B89-8534-2DE1E0F2B7AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List of resources</p>
         */
        public Builder tagResources(java.util.List<TagResources> tagResources) {
            this.tagResources = tagResources;
            return this;
        }

        /**
         * <p>Total</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTagResourcesResponseBody build() {
            return new ListTagResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTagResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTagResourcesResponseBody</p>
     */
    public static class TagResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private TagResources(Builder builder) {
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagResources create() {
            return builder().build();
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

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String resourceId; 
            private String resourceType; 
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(TagResources model) {
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>ResourceId</p>
             * 
             * <strong>example:</strong>
             * <p>189</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>Resource type</p>
             * 
             * <strong>example:</strong>
             * <p>ExperimentPlan</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>Tag key</p>
             * 
             * <strong>example:</strong>
             * <p>owner</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>Tag value</p>
             * 
             * <strong>example:</strong>
             * <p>syg</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public TagResources build() {
                return new TagResources(this);
            } 

        } 

    }
}
