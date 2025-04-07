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
 * {@link CreateRoutineRouteRequest} extends {@link RequestModel}
 *
 * <p>CreateRoutineRouteRequest</p>
 */
public class CreateRoutineRouteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bypass")
    private String bypass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteEnable")
    private String routeEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteName")
    private String routeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoutineName")
    @com.aliyun.core.annotation.Validation(required = true)
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

    private CreateRoutineRouteRequest(Builder builder) {
        super(builder);
        this.bypass = builder.bypass;
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

    public static CreateRoutineRouteRequest create() {
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

    public static final class Builder extends Request.Builder<CreateRoutineRouteRequest, Builder> {
        private String bypass; 
        private String routeEnable; 
        private String routeName; 
        private String routineName; 
        private String rule; 
        private Integer sequence; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRoutineRouteRequest request) {
            super(request);
            this.bypass = request.bypass;
            this.routeEnable = request.routeEnable;
            this.routeName = request.routeName;
            this.routineName = request.routineName;
            this.rule = request.rule;
            this.sequence = request.sequence;
            this.siteId = request.siteId;
        } 

        /**
         * Bypass.
         */
        public Builder bypass(String bypass) {
            this.putQueryParameter("Bypass", bypass);
            this.bypass = bypass;
            return this;
        }

        /**
         * RouteEnable.
         */
        public Builder routeEnable(String routeEnable) {
            this.putQueryParameter("RouteEnable", routeEnable);
            this.routeEnable = routeEnable;
            return this;
        }

        /**
         * RouteName.
         */
        public Builder routeName(String routeName) {
            this.putQueryParameter("RouteName", routeName);
            this.routeName = routeName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * Rule.
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * Sequence.
         */
        public Builder sequence(Integer sequence) {
            this.putQueryParameter("Sequence", sequence);
            this.sequence = sequence;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public CreateRoutineRouteRequest build() {
            return new CreateRoutineRouteRequest(this);
        } 

    } 

}
