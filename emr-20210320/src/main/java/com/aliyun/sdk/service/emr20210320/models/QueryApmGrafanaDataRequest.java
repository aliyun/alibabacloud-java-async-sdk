// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryApmGrafanaDataRequest} extends {@link RequestModel}
 *
 * <p>QueryApmGrafanaDataRequest</p>
 */
public class QueryApmGrafanaDataRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("DashboardId")
    private String dashboardId;

    @Query
    @NameInMap("End")
    private String end;

    @Query
    @NameInMap("Provider")
    private String provider;

    @Query
    @NameInMap("Query")
    private String query;

    @Query
    @NameInMap("QueryParams")
    private QueryParams queryParams;

    @Query
    @NameInMap("QueryUrl")
    @Validation(required = true)
    private String queryUrl;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Start")
    private String start;

    @Query
    @NameInMap("Step")
    private String step;

    @Query
    @NameInMap("Time")
    private String time;

    @Query
    @NameInMap("Variables")
    private java.util.Map < String, String > variables;

    private QueryApmGrafanaDataRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.dashboardId = builder.dashboardId;
        this.end = builder.end;
        this.provider = builder.provider;
        this.query = builder.query;
        this.queryParams = builder.queryParams;
        this.queryUrl = builder.queryUrl;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.start = builder.start;
        this.step = builder.step;
        this.time = builder.time;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryApmGrafanaDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dashboardId
     */
    public String getDashboardId() {
        return this.dashboardId;
    }

    /**
     * @return end
     */
    public String getEnd() {
        return this.end;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return queryParams
     */
    public QueryParams getQueryParams() {
        return this.queryParams;
    }

    /**
     * @return queryUrl
     */
    public String getQueryUrl() {
        return this.queryUrl;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return start
     */
    public String getStart() {
        return this.start;
    }

    /**
     * @return step
     */
    public String getStep() {
        return this.step;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    /**
     * @return variables
     */
    public java.util.Map < String, String > getVariables() {
        return this.variables;
    }

    public static final class Builder extends Request.Builder<QueryApmGrafanaDataRequest, Builder> {
        private String clusterId; 
        private String dashboardId; 
        private String end; 
        private String provider; 
        private String query; 
        private QueryParams queryParams; 
        private String queryUrl; 
        private String regionId; 
        private String resourceGroupId; 
        private String start; 
        private String step; 
        private String time; 
        private java.util.Map < String, String > variables; 

        private Builder() {
            super();
        } 

        private Builder(QueryApmGrafanaDataRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.dashboardId = request.dashboardId;
            this.end = request.end;
            this.provider = request.provider;
            this.query = request.query;
            this.queryParams = request.queryParams;
            this.queryUrl = request.queryUrl;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.start = request.start;
            this.step = request.step;
            this.time = request.time;
            this.variables = request.variables;
        } 

        /**
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * DashboardId.
         */
        public Builder dashboardId(String dashboardId) {
            this.putQueryParameter("DashboardId", dashboardId);
            this.dashboardId = dashboardId;
            return this;
        }

        /**
         * End.
         */
        public Builder end(String end) {
            this.putQueryParameter("End", end);
            this.end = end;
            return this;
        }

        /**
         * Provider.
         */
        public Builder provider(String provider) {
            this.putQueryParameter("Provider", provider);
            this.provider = provider;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * QueryParams.
         */
        public Builder queryParams(QueryParams queryParams) {
            this.putQueryParameter("QueryParams", queryParams);
            this.queryParams = queryParams;
            return this;
        }

        /**
         * QueryUrl.
         */
        public Builder queryUrl(String queryUrl) {
            this.putQueryParameter("QueryUrl", queryUrl);
            this.queryUrl = queryUrl;
            return this;
        }

        /**
         * 地域ID。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 如果存在clusterId，从Cluster中获取该值，如果clusterId为空，用户显式指定
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Start.
         */
        public Builder start(String start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        /**
         * Step.
         */
        public Builder step(String step) {
            this.putQueryParameter("Step", step);
            this.step = step;
            return this;
        }

        /**
         * Time.
         */
        public Builder time(String time) {
            this.putQueryParameter("Time", time);
            this.time = time;
            return this;
        }

        /**
         * Variables.
         */
        public Builder variables(java.util.Map < String, String > variables) {
            String variablesShrink = shrink(variables, "Variables", "json");
            this.putQueryParameter("Variables", variablesShrink);
            this.variables = variables;
            return this;
        }

        @Override
        public QueryApmGrafanaDataRequest build() {
            return new QueryApmGrafanaDataRequest(this);
        } 

    } 

    public static class QueryParams extends TeaModel {
        @NameInMap("PanelId")
        private Long panelId;

        @NameInMap("RefId")
        private String refId;

        @NameInMap("VariableName")
        private String variableName;

        private QueryParams(Builder builder) {
            this.panelId = builder.panelId;
            this.refId = builder.refId;
            this.variableName = builder.variableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryParams create() {
            return builder().build();
        }

        /**
         * @return panelId
         */
        public Long getPanelId() {
            return this.panelId;
        }

        /**
         * @return refId
         */
        public String getRefId() {
            return this.refId;
        }

        /**
         * @return variableName
         */
        public String getVariableName() {
            return this.variableName;
        }

        public static final class Builder {
            private Long panelId; 
            private String refId; 
            private String variableName; 

            /**
             * PanelId.
             */
            public Builder panelId(Long panelId) {
                this.panelId = panelId;
                return this;
            }

            /**
             * RefId.
             */
            public Builder refId(String refId) {
                this.refId = refId;
                return this;
            }

            /**
             * VariableName.
             */
            public Builder variableName(String variableName) {
                this.variableName = variableName;
                return this;
            }

            public QueryParams build() {
                return new QueryParams(this);
            } 

        } 

    }
}
