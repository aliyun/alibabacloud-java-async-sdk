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
 * {@link UpdateCloudGtmAddressPoolBasicConfigResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCloudGtmAddressPoolBasicConfigResponseBody</p>
 */
public class UpdateCloudGtmAddressPoolBasicConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddressPoolId")
    private String addressPoolId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private UpdateCloudGtmAddressPoolBasicConfigResponseBody(Builder builder) {
        this.addressPoolId = builder.addressPoolId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCloudGtmAddressPoolBasicConfigResponseBody create() {
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
         * <p>Unique request identification code.</p>
         * 
         * <strong>example:</strong>
         * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Modify the basic configuration of the address pool operation success:</p>
         * <ul>
         * <li>true: Operation successful</li>
         * <li>false: Operation failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateCloudGtmAddressPoolBasicConfigResponseBody build() {
            return new UpdateCloudGtmAddressPoolBasicConfigResponseBody(this);
        } 

    } 

}
