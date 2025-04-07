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
         * Bypass.
         */
        public Builder bypass(String bypass) {
            this.bypass = bypass;
            return this;
        }

        /**
         * ConfigId.
         */
        public Builder configId(Long configId) {
            this.configId = configId;
            return this;
        }

        /**
         * ConfigType.
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RouteEnable.
         */
        public Builder routeEnable(String routeEnable) {
            this.routeEnable = routeEnable;
            return this;
        }

        /**
         * RouteName.
         */
        public Builder routeName(String routeName) {
            this.routeName = routeName;
            return this;
        }

        /**
         * RoutineName.
         */
        public Builder routineName(String routineName) {
            this.routineName = routineName;
            return this;
        }

        /**
         * Rule.
         */
        public Builder rule(String rule) {
            this.rule = rule;
            return this;
        }

        /**
         * Sequence.
         */
        public Builder sequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }

        /**
         * SiteVersion.
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
