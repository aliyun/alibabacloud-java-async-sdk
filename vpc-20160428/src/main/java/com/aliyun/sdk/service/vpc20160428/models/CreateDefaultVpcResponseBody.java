// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDefaultVpcResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDefaultVpcResponseBody</p>
 */
public class CreateDefaultVpcResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteTableId")
    private String routeTableId;

    @com.aliyun.core.annotation.NameInMap("VRouterId")
    private String vRouterId;

    @com.aliyun.core.annotation.NameInMap("VpcId")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The route table ID that is automatically created by the system after you create a default VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp1q1uirugzb1x32m****</p>
         */
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }

        /**
         * <p>The vRouter ID that is automatically created by the system after you create a default VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vrt-bp1lhl0taikrteen8****</p>
         */
        public Builder vRouterId(String vRouterId) {
            this.vRouterId = vRouterId;
            return this;
        }

        /**
         * <p>The ID of the default VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp15zckdt37pq72zv****</p>
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
