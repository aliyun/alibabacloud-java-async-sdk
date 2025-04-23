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
 * {@link ReplaceCloudGtmAddressPoolAddressResponseBody} extends {@link TeaModel}
 *
 * <p>ReplaceCloudGtmAddressPoolAddressResponseBody</p>
 */
public class ReplaceCloudGtmAddressPoolAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddressPoolId")
    private String addressPoolId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ReplaceCloudGtmAddressPoolAddressResponseBody(Builder builder) {
        this.addressPoolId = builder.addressPoolId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplaceCloudGtmAddressPoolAddressResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ReplaceCloudGtmAddressPoolAddressResponseBody model) {
            this.addressPoolId = model.addressPoolId;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The ID of the address pool. This ID uniquely identifies the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>pool-89618921167339**24</p>
         */
        public Builder addressPoolId(String addressPoolId) {
            this.addressPoolId = addressPoolId;
            return this;
        }

        /**
         * <p>Unique request identification code.</p>
         * 
         * <strong>example:</strong>
         * <p>B57C121B-A45F-44D8-A9B2-13E5A5044195</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful:</p>
         * <ul>
         * <li>true: Successful. - false: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ReplaceCloudGtmAddressPoolAddressResponseBody build() {
            return new ReplaceCloudGtmAddressPoolAddressResponseBody(this);
        } 

    } 

}
