// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
 * {@link CreateReservedNodePoolResponseBody} extends {@link TeaModel}
 *
 * <p>CreateReservedNodePoolResponseBody</p>
 */
public class CreateReservedNodePoolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ReservedNodePoolId")
    private String reservedNodePoolId;

    private CreateReservedNodePoolResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.reservedNodePoolId = builder.reservedNodePoolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReservedNodePoolResponseBody create() {
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
     * @return reservedNodePoolId
     */
    public String getReservedNodePoolId() {
        return this.reservedNodePoolId;
    }

    public static final class Builder {
        private String requestId; 
        private String reservedNodePoolId; 

        private Builder() {
        } 

        private Builder(CreateReservedNodePoolResponseBody model) {
            this.requestId = model.requestId;
            this.reservedNodePoolId = model.reservedNodePoolId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ReservedNodePoolId.
         */
        public Builder reservedNodePoolId(String reservedNodePoolId) {
            this.reservedNodePoolId = reservedNodePoolId;
            return this;
        }

        public CreateReservedNodePoolResponseBody build() {
            return new CreateReservedNodePoolResponseBody(this);
        } 

    } 

}
