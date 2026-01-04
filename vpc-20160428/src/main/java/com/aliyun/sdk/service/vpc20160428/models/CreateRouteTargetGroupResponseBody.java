// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link CreateRouteTargetGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRouteTargetGroupResponseBody</p>
 */
public class CreateRouteTargetGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteTargetGroupId")
    private String routeTargetGroupId;

    private CreateRouteTargetGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.routeTargetGroupId = builder.routeTargetGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRouteTargetGroupResponseBody create() {
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
     * @return routeTargetGroupId
     */
    public String getRouteTargetGroupId() {
        return this.routeTargetGroupId;
    }

    public static final class Builder {
        private String requestId; 
        private String routeTargetGroupId; 

        private Builder() {
        } 

        private Builder(CreateRouteTargetGroupResponseBody model) {
            this.requestId = model.requestId;
            this.routeTargetGroupId = model.routeTargetGroupId;
        } 

        /**
         * <p>ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8AA5CE21-2E6A-4530-BDF5-F055849476E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the route target group instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rtg-xxxx</p>
         */
        public Builder routeTargetGroupId(String routeTargetGroupId) {
            this.routeTargetGroupId = routeTargetGroupId;
            return this;
        }

        public CreateRouteTargetGroupResponseBody build() {
            return new CreateRouteTargetGroupResponseBody(this);
        } 

    } 

}
