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
    @com.aliyun.core.annotation.NameInMap("X-Debug-Id")
    private String xDebugId;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("x-sysom-invoke-source")
    private String xSysomInvokeSource;

    private ListAllInstancesRequest(Builder builder) {
        super(builder);
        this.xDebugId = builder.xDebugId;
        this.current = builder.current;
        this.filters = builder.filters;
        this.instanceType = builder.instanceType;
        this.managedType = builder.managedType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.pluginId = builder.pluginId;
        this.region = builder.region;
        this.xSysomInvokeSource = builder.xSysomInvokeSource;
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
     * @return xDebugId
     */
    public String getXDebugId() {
        return this.xDebugId;
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

    /**
     * @return xSysomInvokeSource
     */
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

    public static final class Builder extends Request.Builder<ListAllInstancesRequest, Builder> {
        private String xDebugId; 
        private String current; 
        private String filters; 
        private String instanceType; 
        private String managedType; 
        private Integer maxResults; 
        private String nextToken; 
        private String pageSize; 
        private String pluginId; 
        private String region; 
        private String xSysomInvokeSource; 

        private Builder() {
            super();
        } 

        private Builder(ListAllInstancesRequest request) {
            super(request);
            this.xDebugId = request.xDebugId;
            this.current = request.current;
            this.filters = request.filters;
            this.instanceType = request.instanceType;
            this.managedType = request.managedType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.pluginId = request.pluginId;
            this.region = request.region;
            this.xSysomInvokeSource = request.xSysomInvokeSource;
        } 

        /**
         * X-Debug-Id.
         */
        public Builder xDebugId(String xDebugId) {
            this.putQueryParameter("X-Debug-Id", xDebugId);
            this.xDebugId = xDebugId;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder current(String current) {
            this.putQueryParameter("current", current);
            this.current = current;
            return this;
        }

        /**
         * <p>The list of filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder filters(String filters) {
            this.putQueryParameter("filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("instanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The management type.</p>
         * 
         * <strong>example:</strong>
         * <p>managed</p>
         */
        public Builder managedType(String managedType) {
            this.putQueryParameter("managedType", managedType);
            this.managedType = managedType;
            return this;
        }

        /**
         * <p>The maximum number of records to retrieve in a single request.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * <blockquote>
         * <p>If this parameter is not empty, more data is available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>U+w1wv2R4ZWR5oZLXD0+Dp4dD+2BRJj42DLT6GrZysw=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The plugin ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01fc4a0b-f199-4885-9861-b4054a310fe7</p>
         */
        public Builder pluginId(String pluginId) {
            this.putQueryParameter("pluginId", pluginId);
            this.pluginId = pluginId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * x-sysom-invoke-source.
         */
        public Builder xSysomInvokeSource(String xSysomInvokeSource) {
            this.putQueryParameter("x-sysom-invoke-source", xSysomInvokeSource);
            this.xSysomInvokeSource = xSysomInvokeSource;
            return this;
        }

        @Override
        public ListAllInstancesRequest build() {
            return new ListAllInstancesRequest(this);
        } 

    } 

}
