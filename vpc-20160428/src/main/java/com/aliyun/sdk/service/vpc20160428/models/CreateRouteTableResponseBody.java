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
 * {@link CreateRouteTableResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRouteTableResponseBody</p>
 */
public class CreateRouteTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteTableId")
    private String routeTableId;

    private CreateRouteTableResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.routeTableId = builder.routeTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRouteTableResponseBody create() {
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
     * @return routeTableId
     */
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public static final class Builder {
        private String requestId; 
        private String routeTableId; 

        private Builder() {
        } 

        private Builder(CreateRouteTableResponseBody model) {
            this.requestId = model.requestId;
            this.routeTableId = model.routeTableId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>62172DD5-6BAC-45DF-8D44-E11ED28DCAC0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The route table ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp145q7glnuzdvzu2****</p>
         */
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }

        public CreateRouteTableResponseBody build() {
            return new CreateRouteTableResponseBody(this);
        } 

    } 

}
