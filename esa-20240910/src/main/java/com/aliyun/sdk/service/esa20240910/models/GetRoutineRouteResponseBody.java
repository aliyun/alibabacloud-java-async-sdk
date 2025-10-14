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
 * {@link GetRoutineRouteResponseBody} extends {@link TeaModel}
 *
 * <p>GetRoutineRouteResponseBody</p>
 */
public class GetRoutineRouteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bypass")
    private String bypass;

    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private Long configId;

    @com.aliyun.core.annotation.NameInMap("ConfigType")
    private String configType;

    @com.aliyun.core.annotation.NameInMap("Fallback")
    private String fallback;

    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteEnable")
    private String routeEnable;

    @com.aliyun.core.annotation.NameInMap("RouteName")
    private String routeName;

    @com.aliyun.core.annotation.NameInMap("RoutineName")
    private String routineName;

    @com.aliyun.core.annotation.NameInMap("Rule")
    private String rule;

    @com.aliyun.core.annotation.NameInMap("Sequence")
    private Integer sequence;

    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

    private GetRoutineRouteResponseBody(Builder builder) {
        this.bypass = builder.bypass;
        this.configId = builder.configId;
        this.configType = builder.configType;
        this.fallback = builder.fallback;
        this.mode = builder.mode;
        this.requestId = builder.requestId;
        this.routeEnable = builder.routeEnable;
        this.routeName = builder.routeName;
        this.routineName = builder.routineName;
        this.rule = builder.rule;
        this.sequence = builder.sequence;
        this.siteVersion = builder.siteVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoutineRouteResponseBody create() {
        return builder().build();
    }

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
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return fallback
     */
    public String getFallback() {
        return this.fallback;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return siteVersion
     */
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public static final class Builder {
        private String bypass; 
        private Long configId; 
        private String configType; 
        private String fallback; 
        private String mode; 
        private String requestId; 
        private String routeEnable; 
        private String routeName; 
        private String routineName; 
        private String rule; 
        private Integer sequence; 
        private Integer siteVersion; 

        private Builder() {
        } 

        private Builder(GetRoutineRouteResponseBody model) {
            this.bypass = model.bypass;
            this.configId = model.configId;
            this.configType = model.configType;
            this.fallback = model.fallback;
            this.mode = model.mode;
            this.requestId = model.requestId;
            this.routeEnable = model.routeEnable;
            this.routeName = model.routeName;
            this.routineName = model.routineName;
            this.rule = model.rule;
            this.sequence = model.sequence;
            this.siteVersion = model.siteVersion;
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
            this.bypass = bypass;
            return this;
        }

        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816******</p>
         */
        public Builder configId(Long configId) {
            this.configId = configId;
            return this;
        }

        /**
         * <p>The configuration type to query. Valid values:</p>
         * <ul>
         * <li>global: global configurations.</li>
         * <li>rule: queries rule configurations.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        /**
         * <p>The exception origin fetch switch. After you turn on this switch, if a function exception occurs, such as CPU usage exceeding the upper limit, requests are sent back to the origin. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder fallback(String fallback) {
            this.fallback = fallback;
            return this;
        }

        /**
         * <p>The configuration mode. Valid values: Valid values:</p>
         * <ul>
         * <li>simple</li>
         * <li>custom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>simple</p>
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
            this.routeEnable = routeEnable;
            return this;
        }

        /**
         * <p>The route name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_route</p>
         */
        public Builder routeName(String routeName) {
            this.routeName = routeName;
            return this;
        }

        /**
         * <p>The function name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-routine1</p>
         */
        public Builder routineName(String routineName) {
            this.routineName = routineName;
            return this;
        }

        /**
         * <p>The rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq &quot;video.example.com&quot;)</p>
         */
        public Builder rule(String rule) {
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
            this.sequence = sequence;
            return this;
        }

        /**
         * <p>The version number of the website.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder siteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }

        public GetRoutineRouteResponseBody build() {
            return new GetRoutineRouteResponseBody(this);
        } 

    } 

}
