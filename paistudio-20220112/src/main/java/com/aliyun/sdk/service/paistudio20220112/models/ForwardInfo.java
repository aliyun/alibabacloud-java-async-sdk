// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link ForwardInfo} extends {@link TeaModel}
 *
 * <p>ForwardInfo</p>
 */
public class ForwardInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EipAllocationId")
    private String eipAllocationId;

    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    private ForwardInfo(Builder builder) {
        this.eipAllocationId = builder.eipAllocationId;
        this.natGatewayId = builder.natGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ForwardInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eipAllocationId
     */
    public String getEipAllocationId() {
        return this.eipAllocationId;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public static final class Builder {
        private String eipAllocationId; 
        private String natGatewayId; 

        private Builder() {
        } 

        private Builder(ForwardInfo model) {
            this.eipAllocationId = model.eipAllocationId;
            this.natGatewayId = model.natGatewayId;
        } 

        /**
         * EipAllocationId.
         */
        public Builder eipAllocationId(String eipAllocationId) {
            this.eipAllocationId = eipAllocationId;
            return this;
        }

        /**
         * NatGatewayId.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        public ForwardInfo build() {
            return new ForwardInfo(this);
        } 

    } 

}
