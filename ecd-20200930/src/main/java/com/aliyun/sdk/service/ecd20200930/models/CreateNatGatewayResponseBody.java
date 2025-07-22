// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link CreateNatGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNatGatewayResponseBody</p>
 */
public class CreateNatGatewayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ForwardTableIds")
    private java.util.List<String> forwardTableIds;

    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnatTableIds")
    private java.util.List<String> snatTableIds;

    private CreateNatGatewayResponseBody(Builder builder) {
        this.forwardTableIds = builder.forwardTableIds;
        this.natGatewayId = builder.natGatewayId;
        this.requestId = builder.requestId;
        this.snatTableIds = builder.snatTableIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNatGatewayResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forwardTableIds
     */
    public java.util.List<String> getForwardTableIds() {
        return this.forwardTableIds;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snatTableIds
     */
    public java.util.List<String> getSnatTableIds() {
        return this.snatTableIds;
    }

    public static final class Builder {
        private java.util.List<String> forwardTableIds; 
        private String natGatewayId; 
        private String requestId; 
        private java.util.List<String> snatTableIds; 

        private Builder() {
        } 

        private Builder(CreateNatGatewayResponseBody model) {
            this.forwardTableIds = model.forwardTableIds;
            this.natGatewayId = model.natGatewayId;
            this.requestId = model.requestId;
            this.snatTableIds = model.snatTableIds;
        } 

        /**
         * ForwardTableIds.
         */
        public Builder forwardTableIds(java.util.List<String> forwardTableIds) {
            this.forwardTableIds = forwardTableIds;
            return this;
        }

        /**
         * NatGatewayId.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
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
         * SnatTableIds.
         */
        public Builder snatTableIds(java.util.List<String> snatTableIds) {
            this.snatTableIds = snatTableIds;
            return this;
        }

        public CreateNatGatewayResponseBody build() {
            return new CreateNatGatewayResponseBody(this);
        } 

    } 

}
