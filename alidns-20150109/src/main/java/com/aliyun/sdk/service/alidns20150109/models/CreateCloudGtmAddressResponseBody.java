// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCloudGtmAddressResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCloudGtmAddressResponseBody</p>
 */
public class CreateCloudGtmAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddressId")
    private String addressId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateCloudGtmAddressResponseBody(Builder builder) {
        this.addressId = builder.addressId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudGtmAddressResponseBody create() {
        return builder().build();
    }

    /**
     * @return addressId
     */
    public String getAddressId() {
        return this.addressId;
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
        private String addressId; 
        private String requestId; 
        private Boolean success; 

        /**
         * AddressId.
         */
        public Builder addressId(String addressId) {
            this.addressId = addressId;
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

        public CreateCloudGtmAddressResponseBody build() {
            return new CreateCloudGtmAddressResponseBody(this);
        } 

    } 

}
