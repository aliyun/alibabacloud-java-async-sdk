// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link ListAllInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListAllInstancesRequest</p>
 */
public class ListAllInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("current")
    private String current;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filters")
    private String filters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("managedType")
    private String managedType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pluginId")
    private String pluginId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    private ListAllInstancesRequest(Builder builder) {
        super(builder);
        this.current = builder.current;
        this.filters = builder.filters;
        this.instanceType = builder.instanceType;
        this.managedType = builder.managedType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.pluginId = builder.pluginId;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAllInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return current
     */
    public String getCurrent() {
        return this.current;
    }

    /**
     * @return filters
     */
    public String getFilters() {
        return this.filters;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return managedType
     */
    public String getManagedType() {
        return this.managedType;
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
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pluginId
     */
    public String getPluginId() {
        return this.pluginId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<ListAllInstancesRequest, Builder> {
        private String current; 
        private String filters; 
        private String instanceType; 
        private String managedType; 
        private Integer maxResults; 
        private String nextToken; 
        private String pageSize; 
        private String pluginId; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(ListAllInstancesRequest request) {
            super(request);
            this.current = request.current;
            this.filters = request.filters;
            this.instanceType = request.instanceType;
            this.managedType = request.managedType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.pluginId = request.pluginId;
            this.region = request.region;
        } 

        /**
         * current.
         */
        public Builder current(String current) {
            this.putQueryParameter("current", current);
            this.current = current;
            return this;
        }

        /**
         * filters.
         */
        public Builder filters(String filters) {
            this.putQueryParameter("filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * instanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("instanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * managedType.
         */
        public Builder managedType(String managedType) {
            this.putQueryParameter("managedType", managedType);
            this.managedType = managedType;
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
         * pageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * pluginId.
         */
        public Builder pluginId(String pluginId) {
            this.putQueryParameter("pluginId", pluginId);
            this.pluginId = pluginId;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        @Override
        public ListAllInstancesRequest build() {
            return new ListAllInstancesRequest(this);
        } 

    } 

}
