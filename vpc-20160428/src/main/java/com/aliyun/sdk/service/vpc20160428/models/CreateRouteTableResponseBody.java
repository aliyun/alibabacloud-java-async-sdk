// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRouteTableResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRouteTableResponseBody</p>
 */
public class CreateRouteTableResponseBody extends TeaModel {
    @NameInMap("AssociateType")
    private String associateType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RouteTableId")
    private String routeTableId;

    private CreateRouteTableResponseBody(Builder builder) {
        this.associateType = builder.associateType;
        this.requestId = builder.requestId;
        this.routeTableId = builder.routeTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRouteTableResponseBody create() {
        return builder().build();
    }

    /**
     * @return associateType
     */
    public String getAssociateType() {
        return this.associateType;
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
        private String associateType; 
        private String requestId; 
        private String routeTableId; 

        /**
         * AssociateType.
         */
        public Builder associateType(String associateType) {
            this.associateType = associateType;
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
         * RouteTableId.
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
