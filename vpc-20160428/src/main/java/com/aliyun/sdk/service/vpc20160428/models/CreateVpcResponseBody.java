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
 * {@link CreateVpcResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpcResponseBody</p>
 */
public class CreateVpcResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("RouteTableId")
    private String routeTableId;

    @com.aliyun.core.annotation.NameInMap("VRouterId")
    private String vRouterId;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private CreateVpcResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.routeTableId = builder.routeTableId;
        this.vRouterId = builder.vRouterId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpcResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
        private String resourceGroupId; 
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph6aiy****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the route table that is automatically created by the system after the VPC is created.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp145q7glnuzdv****</p>
         */
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }

        /**
         * <p>The ID of the vRouter that is automatically created by the system after the VPC is created.</p>
         * 
         * <strong>example:</strong>
         * <p>vrt-bp1lhl0taikrteen8****</p>
         */
        public Builder vRouterId(String vRouterId) {
            this.vRouterId = vRouterId;
            return this;
        }

        /**
         * <p>The ID of the created VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp15zckdt37pq72zv****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public CreateVpcResponseBody build() {
            return new CreateVpcResponseBody(this);
        } 

    } 

}
