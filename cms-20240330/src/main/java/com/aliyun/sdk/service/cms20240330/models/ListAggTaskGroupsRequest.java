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
 * {@link ListAggTaskGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListAggTaskGroupsRequest</p>
 */
public class ListAggTaskGroupsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filterAggTaskGroupIds")
    private String filterAggTaskGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filterAggTaskGroupNames")
    private String filterAggTaskGroupNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("targetPrometheusId")
    private String targetPrometheusId;

    private ListAggTaskGroupsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.filterAggTaskGroupIds = builder.filterAggTaskGroupIds;
        this.filterAggTaskGroupNames = builder.filterAggTaskGroupNames;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.query = builder.query;
        this.status = builder.status;
        this.tags = builder.tags;
        this.targetPrometheusId = builder.targetPrometheusId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAggTaskGroupsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return filterAggTaskGroupIds
     */
    public String getFilterAggTaskGroupIds() {
        return this.filterAggTaskGroupIds;
    }

    /**
     * @return filterAggTaskGroupNames
     */
    public String getFilterAggTaskGroupNames() {
        return this.filterAggTaskGroupNames;
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
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return targetPrometheusId
     */
    public String getTargetPrometheusId() {
        return this.targetPrometheusId;
    }

    public static final class Builder extends Request.Builder<ListAggTaskGroupsRequest, Builder> {
        private String instanceId; 
        private String filterAggTaskGroupIds; 
        private String filterAggTaskGroupNames; 
        private Integer maxResults; 
        private String nextToken; 
        private String query; 
        private String status; 
        private java.util.List<Tags> tags; 
        private String targetPrometheusId; 

        private Builder() {
            super();
        } 

        private Builder(ListAggTaskGroupsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.filterAggTaskGroupIds = request.filterAggTaskGroupIds;
            this.filterAggTaskGroupNames = request.filterAggTaskGroupNames;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.query = request.query;
            this.status = request.status;
            this.tags = request.tags;
            this.targetPrometheusId = request.targetPrometheusId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rw-pq4apob9jm</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * filterAggTaskGroupIds.
         */
        public Builder filterAggTaskGroupIds(String filterAggTaskGroupIds) {
            this.putQueryParameter("filterAggTaskGroupIds", filterAggTaskGroupIds);
            this.filterAggTaskGroupIds = filterAggTaskGroupIds;
            return this;
        }

        /**
         * filterAggTaskGroupNames.
         */
        public Builder filterAggTaskGroupNames(String filterAggTaskGroupNames) {
            this.putQueryParameter("filterAggTaskGroupNames", filterAggTaskGroupNames);
            this.filterAggTaskGroupNames = filterAggTaskGroupNames;
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
         * query.
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            String tagsShrink = shrink(tags, "tags", "json");
            this.putQueryParameter("tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * targetPrometheusId.
         */
        public Builder targetPrometheusId(String targetPrometheusId) {
            this.putQueryParameter("targetPrometheusId", targetPrometheusId);
            this.targetPrometheusId = targetPrometheusId;
            return this;
        }

        @Override
        public ListAggTaskGroupsRequest build() {
            return new ListAggTaskGroupsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListAggTaskGroupsRequest} extends {@link TeaModel}
     *
     * <p>ListAggTaskGroupsRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Tags(Builder builder) {
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

            private Builder(Tags model) {
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

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
