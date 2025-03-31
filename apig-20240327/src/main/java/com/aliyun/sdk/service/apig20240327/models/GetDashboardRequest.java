// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetDashboardRequest} extends {@link RequestModel}
 *
 * <p>GetDashboardRequest</p>
 */
public class GetDashboardRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("acceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("apiId")
    private String apiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filter")
    private Filter filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pluginClassId")
    private String pluginClassId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pluginId")
    private String pluginId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("upstreamCluster")
    private String upstreamCluster;

    private GetDashboardRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.acceptLanguage = builder.acceptLanguage;
        this.apiId = builder.apiId;
        this.filter = builder.filter;
        this.name = builder.name;
        this.pluginClassId = builder.pluginClassId;
        this.pluginId = builder.pluginId;
        this.source = builder.source;
        this.upstreamCluster = builder.upstreamCluster;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDashboardRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return apiId
     */
    public String getApiId() {
        return this.apiId;
    }

    /**
     * @return filter
     */
    public Filter getFilter() {
        return this.filter;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pluginClassId
     */
    public String getPluginClassId() {
        return this.pluginClassId;
    }

    /**
     * @return pluginId
     */
    public String getPluginId() {
        return this.pluginId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return upstreamCluster
     */
    public String getUpstreamCluster() {
        return this.upstreamCluster;
    }

    public static final class Builder extends Request.Builder<GetDashboardRequest, Builder> {
        private String gatewayId; 
        private String acceptLanguage; 
        private String apiId; 
        private Filter filter; 
        private String name; 
        private String pluginClassId; 
        private String pluginId; 
        private String source; 
        private String upstreamCluster; 

        private Builder() {
            super();
        } 

        private Builder(GetDashboardRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.acceptLanguage = request.acceptLanguage;
            this.apiId = request.apiId;
            this.filter = request.filter;
            this.name = request.name;
            this.pluginClassId = request.pluginClassId;
            this.pluginId = request.pluginId;
            this.source = request.source;
            this.upstreamCluster = request.upstreamCluster;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-co370icmjeu****</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The language. Valid values: zh (Chinese) and en (English).</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("acceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>API ID</p>
         * 
         * <strong>example:</strong>
         * <p>api-c9uuekzmia8q2****</p>
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("apiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * <p>The filter configurations.</p>
         */
        public Builder filter(Filter filter) {
            String filterShrink = shrink(filter, "filter", "json");
            this.putQueryParameter("filter", filterShrink);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The dashboard name.</p>
         * <ul>
         * <li>LOG: access logs</li>
         * <li>PLUGIN: plug-in logs</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PLUGIN</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The plug-in ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pls-dn82a9djd8z****</p>
         */
        public Builder pluginClassId(String pluginClassId) {
            this.putQueryParameter("pluginClassId", pluginClassId);
            this.pluginClassId = pluginClassId;
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
         * <p>The dashboard source. Valid values:</p>
         * <ul>
         * <li>SLS: Simple Log Service</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SLS</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("source", source);
            this.source = source;
            return this;
        }

        /**
         * upstreamCluster.
         */
        public Builder upstreamCluster(String upstreamCluster) {
            this.putQueryParameter("upstreamCluster", upstreamCluster);
            this.upstreamCluster = upstreamCluster;
            return this;
        }

        @Override
        public GetDashboardRequest build() {
            return new GetDashboardRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetDashboardRequest} extends {@link TeaModel}
     *
     * <p>GetDashboardRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("routeName")
        private String routeName;

        private Filter(Builder builder) {
            this.routeName = builder.routeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return routeName
         */
        public String getRouteName() {
            return this.routeName;
        }

        public static final class Builder {
            private String routeName; 

            private Builder() {
            } 

            private Builder(Filter model) {
                this.routeName = model.routeName;
            } 

            /**
             * <p>The route name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-route</p>
             */
            public Builder routeName(String routeName) {
                this.routeName = routeName;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
}
