// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link AllocatePublicNetworkAddressResponseBody} extends {@link TeaModel}
 *
 * <p>AllocatePublicNetworkAddressResponseBody</p>
 */
public class AllocatePublicNetworkAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AllocatePublicNetworkAddressResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocatePublicNetworkAddressResponseBody create() {
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

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(AllocatePublicNetworkAddressResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8AA45036-497F-52E7-B951-F9C7B239****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AllocatePublicNetworkAddressResponseBody build() {
            return new AllocatePublicNetworkAddressResponseBody(this);
        } 

    } 

}
