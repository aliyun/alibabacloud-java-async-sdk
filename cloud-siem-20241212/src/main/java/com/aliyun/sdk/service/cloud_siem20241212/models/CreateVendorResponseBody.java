// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link CreateVendorResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVendorResponseBody</p>
 */
public class CreateVendorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VendorId")
    private String vendorId;

    private CreateVendorResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vendorId = builder.vendorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVendorResponseBody create() {
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
     * @return vendorId
     */
    public String getVendorId() {
        return this.vendorId;
    }

    public static final class Builder {
        private String requestId; 
        private String vendorId; 

        private Builder() {
        } 

        private Builder(CreateVendorResponseBody model) {
            this.requestId = model.requestId;
            this.vendorId = model.vendorId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VendorId.
         */
        public Builder vendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }

        public CreateVendorResponseBody build() {
            return new CreateVendorResponseBody(this);
        } 

    } 

}
