// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link QueryApmGrafanaDataRequest} extends {@link RequestModel}
 *
 * <p>QueryApmGrafanaDataRequest</p>
 */
public class QueryApmGrafanaDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("componentName")
    private String componentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dashboardId")
    private String dashboardId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("end")
    private String end;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("provider")
    private String provider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("queryParams")
    private QueryParams queryParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("queryUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queryUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("start")
    private String start;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("step")
    private String step;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("time")
    private String time;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("variables")
    private String variables;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private QueryApmGrafanaDataRequest(Builder builder) {
        super(builder);
        this.componentName = builder.componentName;
        this.dashboardId = builder.dashboardId;
        this.end = builder.end;
        this.provider = builder.provider;
        this.query = builder.query;
        this.queryParams = builder.queryParams;
        this.queryUrl = builder.queryUrl;
        this.regionId = builder.regionId;
        this.start = builder.start;
        this.step = builder.step;
        this.time = builder.time;
        this.variables = builder.variables;
        this.workspaceId = builder.workspaceId;
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
     * @return componentName
     */
    public String getComponentName() {
        return this.componentName;
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
    public String getVariables() {
        return this.variables;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<QueryApmGrafanaDataRequest, Builder> {
        private String componentName; 
        private String dashboardId; 
        private String end; 
        private String provider; 
        private String query; 
        private QueryParams queryParams; 
        private String queryUrl; 
        private String regionId; 
        private String start; 
        private String step; 
        private String time; 
        private String variables; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryApmGrafanaDataRequest request) {
            super(request);
            this.componentName = request.componentName;
            this.dashboardId = request.dashboardId;
            this.end = request.end;
            this.provider = request.provider;
            this.query = request.query;
            this.queryParams = request.queryParams;
            this.queryUrl = request.queryUrl;
            this.regionId = request.regionId;
            this.start = request.start;
            this.step = request.step;
            this.time = request.time;
            this.variables = request.variables;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The name of the monitoring dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>spark-all</p>
         */
        public Builder componentName(String componentName) {
            this.putQueryParameter("componentName", componentName);
            this.componentName = componentName;
            return this;
        }

        /**
         * <p>The dashboard ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ex2tTKoNz</p>
         */
        public Builder dashboardId(String dashboardId) {
            this.putQueryParameter("dashboardId", dashboardId);
            this.dashboardId = dashboardId;
            return this;
        }

        /**
         * <p>The end time of the query. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1697033783</p>
         */
        public Builder end(String end) {
            this.putQueryParameter("end", end);
            this.end = end;
            return this;
        }

        /**
         * <p>The datasource provider.</p>
         * 
         * <strong>example:</strong>
         * <p>spark</p>
         */
        public Builder provider(String provider) {
            this.putQueryParameter("provider", provider);
            this.provider = provider;
            return this;
        }

        /**
         * <p>The PromQL query expression.</p>
         * 
         * <strong>example:</strong>
         * <p>bizType:</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>The panel-level query parameters.</p>
         */
        public Builder queryParams(QueryParams queryParams) {
            String queryParamsShrink = shrink(queryParams, "queryParams", "json");
            this.putQueryParameter("queryParams", queryParamsShrink);
            this.queryParams = queryParams;
            return this;
        }

        /**
         * <p>The Grafana datasource proxy path.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/api/datasources/proxy/1/api/v1/query_range</p>
         */
        public Builder queryUrl(String queryUrl) {
            this.putQueryParameter("queryUrl", queryUrl);
            this.queryUrl = queryUrl;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The start time of the query. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1697030183</p>
         */
        public Builder start(String start) {
            this.putQueryParameter("start", start);
            this.start = start;
            return this;
        }

        /**
         * <p>The query step, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder step(String step) {
            this.putQueryParameter("step", step);
            this.step = step;
            return this;
        }

        /**
         * <p>The time point for an instant query. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1697033783</p>
         */
        public Builder time(String time) {
            this.putQueryParameter("time", time);
            this.time = time;
            return this;
        }

        /**
         * <p>The dashboard variables, as a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;fenix_job_runId&quot;:&quot;jr-b5059689bb50f360&quot;}</p>
         */
        public Builder variables(String variables) {
            this.putQueryParameter("variables", variables);
            this.variables = variables;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>w-d2d82aa09155****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public QueryApmGrafanaDataRequest build() {
            return new QueryApmGrafanaDataRequest(this);
        } 

    } 

    /**
     * 
     * {@link QueryApmGrafanaDataRequest} extends {@link TeaModel}
     *
     * <p>QueryApmGrafanaDataRequest</p>
     */
    public static class QueryParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("panelId")
        private Long panelId;

        @com.aliyun.core.annotation.NameInMap("refId")
        private String refId;

        @com.aliyun.core.annotation.NameInMap("variableName")
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

            private Builder() {
            } 

            private Builder(QueryParams model) {
                this.panelId = model.panelId;
                this.refId = model.refId;
                this.variableName = model.variableName;
            } 

            /**
             * <p>The panel ID.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder panelId(Long panelId) {
                this.panelId = panelId;
                return this;
            }

            /**
             * <p>The query reference ID in the panel.</p>
             * 
             * <strong>example:</strong>
             * <p>A</p>
             */
            public Builder refId(String refId) {
                this.refId = refId;
                return this;
            }

            /**
             * <p>The variable name. Used when querying the dropdown values of dashboard variables.</p>
             * 
             * <strong>example:</strong>
             * <p>job_oss_download_bandwidth</p>
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
