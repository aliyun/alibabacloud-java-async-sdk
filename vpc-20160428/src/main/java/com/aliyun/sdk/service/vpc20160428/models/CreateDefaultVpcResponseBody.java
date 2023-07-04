// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDefaultVpcResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDefaultVpcResponseBody</p>
 */
public class CreateDefaultVpcResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RouteTableId")
    private String routeTableId;

    @NameInMap("VRouterId")
    private String vRouterId;

    @NameInMap("VpcId")
    private String vpcId;

    private CreateDefaultVpcResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.routeTableId = builder.routeTableId;
        this.vRouterId = builder.vRouterId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDefaultVpcResponseBody create() {
        return builder().build();
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

    /**
     * @return vRouterId
     */
    public String getVRouterId() {
        return this.vRouterId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private String requestId; 
        private String routeTableId; 
        private String vRouterId; 
        private String vpcId; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The route table ID that is automatically created by the system after you create a default VPC.
         */
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }

        /**
         * The vRouter ID that is automatically created by the system after you create a default VPC.
         */
        public Builder vRouterId(String vRouterId) {
            this.vRouterId = vRouterId;
            return this;
        }

        /**
         * The ID of the default VPC.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public CreateDefaultVpcResponseBody build() {
            return new CreateDefaultVpcResponseBody(this);
        } 

    } 

}
