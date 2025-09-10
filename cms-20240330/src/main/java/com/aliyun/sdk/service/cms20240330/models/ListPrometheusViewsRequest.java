// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListPrometheusViewsRequest} extends {@link RequestModel}
 *
 * <p>ListPrometheusViewsRequest</p>
 */
public class ListPrometheusViewsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filterRegionIds")
    private String filterRegionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("prometheusViewIds")
    private String prometheusViewIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("prometheusViewName")
    private String prometheusViewName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private ListPrometheusViewsRequest(Builder builder) {
        super(builder);
        this.filterRegionIds = builder.filterRegionIds;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.prometheusViewIds = builder.prometheusViewIds;
        this.prometheusViewName = builder.prometheusViewName;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceType = builder.resourceType;
        this.tag = builder.tag;
        this.version = builder.version;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrometheusViewsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filterRegionIds
     */
    public String getFilterRegionIds() {
        return this.filterRegionIds;
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
     * @return prometheusViewIds
     */
    public String getPrometheusViewIds() {
        return this.prometheusViewIds;
    }

    /**
     * @return prometheusViewName
     */
    public String getPrometheusViewName() {
        return this.prometheusViewName;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<ListPrometheusViewsRequest, Builder> {
        private String filterRegionIds; 
        private Integer maxResults; 
        private String nextToken; 
        private String prometheusViewIds; 
        private String prometheusViewName; 
        private String resourceGroupId; 
        private String resourceType; 
        private java.util.List<Tag> tag; 
        private String version; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(ListPrometheusViewsRequest request) {
            super(request);
            this.filterRegionIds = request.filterRegionIds;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.prometheusViewIds = request.prometheusViewIds;
            this.prometheusViewName = request.prometheusViewName;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceType = request.resourceType;
            this.tag = request.tag;
            this.version = request.version;
            this.workspace = request.workspace;
        } 

        /**
         * filterRegionIds.
         */
        public Builder filterRegionIds(String filterRegionIds) {
            this.putQueryParameter("filterRegionIds", filterRegionIds);
            this.filterRegionIds = filterRegionIds;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * prometheusViewIds.
         */
        public Builder prometheusViewIds(String prometheusViewIds) {
            this.putQueryParameter("prometheusViewIds", prometheusViewIds);
            this.prometheusViewIds = prometheusViewIds;
            return this;
        }

        /**
         * prometheusViewName.
         */
        public Builder prometheusViewName(String prometheusViewName) {
            this.putQueryParameter("prometheusViewName", prometheusViewName);
            this.prometheusViewName = prometheusViewName;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * tag.
         */
        public Builder tag(java.util.List<Tag> tag) {
            String tagShrink = shrink(tag, "tag", "json");
            this.putQueryParameter("tag", tagShrink);
            this.tag = tag;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.putQueryParameter("version", version);
            this.version = version;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public ListPrometheusViewsRequest build() {
            return new ListPrometheusViewsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListPrometheusViewsRequest} extends {@link TeaModel}
     *
     * <p>ListPrometheusViewsRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
