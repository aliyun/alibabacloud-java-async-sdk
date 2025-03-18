// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateNatGatewayResponseBody(Builder builder) {
        this.natGatewayId = builder.natGatewayId;
        this.requestId = builder.requestId;
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

    public static final class Builder {
        private String natGatewayId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateNatGatewayResponseBody model) {
            this.natGatewayId = model.natGatewayId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>nat-5t7nh1cfm6kxiszlttr38****</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNatGatewayResponseBody build() {
            return new CreateNatGatewayResponseBody(this);
        } 

    } 

}
