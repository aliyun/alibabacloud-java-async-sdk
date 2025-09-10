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
 * {@link ListPrometheusInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListPrometheusInstancesRequest</p>
 */
public class ListPrometheusInstancesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("prometheusInstanceIds")
    private String prometheusInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("prometheusInstanceName")
    private String prometheusInstanceName;

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

    private ListPrometheusInstancesRequest(Builder builder) {
        super(builder);
        this.filterRegionIds = builder.filterRegionIds;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.prometheusInstanceIds = builder.prometheusInstanceIds;
        this.prometheusInstanceName = builder.prometheusInstanceName;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceType = builder.resourceType;
        this.tag = builder.tag;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrometheusInstancesRequest create() {
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
     * @return prometheusInstanceIds
     */
    public String getPrometheusInstanceIds() {
        return this.prometheusInstanceIds;
    }

    /**
     * @return prometheusInstanceName
     */
    public String getPrometheusInstanceName() {
        return this.prometheusInstanceName;
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

    public static final class Builder extends Request.Builder<ListPrometheusInstancesRequest, Builder> {
        private String filterRegionIds; 
        private Integer maxResults; 
        private String nextToken; 
        private String prometheusInstanceIds; 
        private String prometheusInstanceName; 
        private String resourceGroupId; 
        private String resourceType; 
        private java.util.List<Tag> tag; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(ListPrometheusInstancesRequest request) {
            super(request);
            this.filterRegionIds = request.filterRegionIds;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.prometheusInstanceIds = request.prometheusInstanceIds;
            this.prometheusInstanceName = request.prometheusInstanceName;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceType = request.resourceType;
            this.tag = request.tag;
            this.version = request.version;
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
         * prometheusInstanceIds.
         */
        public Builder prometheusInstanceIds(String prometheusInstanceIds) {
            this.putQueryParameter("prometheusInstanceIds", prometheusInstanceIds);
            this.prometheusInstanceIds = prometheusInstanceIds;
            return this;
        }

        /**
         * prometheusInstanceName.
         */
        public Builder prometheusInstanceName(String prometheusInstanceName) {
            this.putQueryParameter("prometheusInstanceName", prometheusInstanceName);
            this.prometheusInstanceName = prometheusInstanceName;
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

        @Override
        public ListPrometheusInstancesRequest build() {
            return new ListPrometheusInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListPrometheusInstancesRequest} extends {@link TeaModel}
     *
     * <p>ListPrometheusInstancesRequest</p>
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
