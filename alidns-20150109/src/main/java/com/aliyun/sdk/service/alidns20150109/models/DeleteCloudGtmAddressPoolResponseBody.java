// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DeleteCloudGtmAddressPoolResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteCloudGtmAddressPoolResponseBody</p>
 */
public class DeleteCloudGtmAddressPoolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddressPoolId")
    private String addressPoolId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DeleteCloudGtmAddressPoolResponseBody(Builder builder) {
        this.addressPoolId = builder.addressPoolId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCloudGtmAddressPoolResponseBody create() {
        return builder().build();
    }

    /**
     * @return addressPoolId
     */
    public String getAddressPoolId() {
        return this.addressPoolId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String addressPoolId; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The ID of the address pool. This ID uniquely identifies the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>pool-89528023225442**16</p>
         */
        public Builder addressPoolId(String addressPoolId) {
            this.addressPoolId = addressPoolId;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteCloudGtmAddressPoolResponseBody build() {
            return new DeleteCloudGtmAddressPoolResponseBody(this);
        } 

    } 

}
