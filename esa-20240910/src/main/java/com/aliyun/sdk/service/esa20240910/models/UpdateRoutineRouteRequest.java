// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateRoutineRouteRequest} extends {@link RequestModel}
 *
 * <p>UpdateRoutineRouteRequest</p>
 */
public class UpdateRoutineRouteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bypass")
    private String bypass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Fallback")
    private String fallback;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteEnable")
    private String routeEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteName")
    private String routeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoutineName")
    private String routineName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rule")
    private String rule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sequence")
    private Integer sequence;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private UpdateRoutineRouteRequest(Builder builder) {
        super(builder);
        this.bypass = builder.bypass;
        this.configId = builder.configId;
        this.fallback = builder.fallback;
        this.routeEnable = builder.routeEnable;
        this.routeName = builder.routeName;
        this.routineName = builder.routineName;
        this.rule = builder.rule;
        this.sequence = builder.sequence;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRoutineRouteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bypass
     */
    public String getBypass() {
        return this.bypass;
    }

    /**
     * @return configId
     */
    public Long getConfigId() {
        return this.configId;
    }

    /**
     * @return fallback
     */
    public String getFallback() {
        return this.fallback;
    }

    /**
     * @return routeEnable
     */
    public String getRouteEnable() {
        return this.routeEnable;
    }

    /**
     * @return routeName
     */
    public String getRouteName() {
        return this.routeName;
    }

    /**
     * @return routineName
     */
    public String getRoutineName() {
        return this.routineName;
    }

    /**
     * @return rule
     */
    public String getRule() {
        return this.rule;
    }

    /**
     * @return sequence
     */
    public Integer getSequence() {
        return this.sequence;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<UpdateRoutineRouteRequest, Builder> {
        private String bypass; 
        private Long configId; 
        private String fallback; 
        private String routeEnable; 
        private String routeName; 
        private String routineName; 
        private String rule; 
        private Integer sequence; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRoutineRouteRequest request) {
            super(request);
            this.bypass = request.bypass;
            this.configId = request.configId;
            this.fallback = request.fallback;
            this.routeEnable = request.routeEnable;
            this.routeName = request.routeName;
            this.routineName = request.routineName;
            this.rule = request.rule;
            this.sequence = request.sequence;
            this.siteId = request.siteId;
        } 

        /**
         * <p>Bypass mode. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder bypass(String bypass) {
            this.putQueryParameter("Bypass", bypass);
            this.bypass = bypass;
            return this;
        }

        /**
         * <p>The ID of the configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>35281609698****</p>
         */
        public Builder configId(Long configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * <p>The exception origin switch. After you turn on this switch, if a function exception occurs, such as CPU usage exceeding the upper limit, requests are sent to the origin. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder fallback(String fallback) {
            this.putQueryParameter("Fallback", fallback);
            this.fallback = fallback;
            return this;
        }

        /**
         * <p>The routing switch. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder routeEnable(String routeEnable) {
            this.putQueryParameter("RouteEnable", routeEnable);
            this.routeEnable = routeEnable;
            return this;
        }

        /**
         * <p>The name of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>test_route</p>
         */
        public Builder routeName(String routeName) {
            this.putQueryParameter("RouteName", routeName);
            this.routeName = routeName;
            return this;
        }

        /**
         * <p>The name of the function.</p>
         * 
         * <strong>example:</strong>
         * <p>test-routine1</p>
         */
        public Builder routineName(String routineName) {
            this.putQueryParameter("RoutineName", routineName);
            this.routineName = routineName;
            return this;
        }

        /**
         * <p>The content of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq &quot;video.example.com&quot;)</p>
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * <p>The order in which the rule is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sequence(Integer sequence) {
            this.putQueryParameter("Sequence", sequence);
            this.sequence = sequence;
            return this;
        }

        /**
         * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456******</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public UpdateRoutineRouteRequest build() {
            return new UpdateRoutineRouteRequest(this);
        } 

    } 

}
