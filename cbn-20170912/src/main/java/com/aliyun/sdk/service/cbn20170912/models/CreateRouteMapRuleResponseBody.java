// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link CreateRouteMapRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRouteMapRuleResponseBody</p>
 */
public class CreateRouteMapRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteMapRuleId")
    private String routeMapRuleId;

    private CreateRouteMapRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.routeMapRuleId = builder.routeMapRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRouteMapRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routeMapRuleId
     */
    public String getRouteMapRuleId() {
        return this.routeMapRuleId;
    }

    public static final class Builder {
        private String requestId; 
        private String routeMapRuleId; 

        private Builder() {
        } 

        private Builder(CreateRouteMapRuleResponseBody model) {
            this.requestId = model.requestId;
            this.routeMapRuleId = model.routeMapRuleId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EF44D7B7-6248-5A60-8A4C-A92388605A57</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the route map rule.</p>
         * 
         * <strong>example:</strong>
         * <p>rmr-3dm13f66wtctcnydup</p>
         */
        public Builder routeMapRuleId(String routeMapRuleId) {
            this.routeMapRuleId = routeMapRuleId;
            return this;
        }

        public CreateRouteMapRuleResponseBody build() {
            return new CreateRouteMapRuleResponseBody(this);
        } 

    } 

}
