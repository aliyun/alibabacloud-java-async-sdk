// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddRegisteredVendorResponseBody} extends {@link TeaModel}
 *
 * <p>AddRegisteredVendorResponseBody</p>
 */
public class AddRegisteredVendorResponseBody extends TeaModel {
    @NameInMap("Description")
    private String description;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Vendor")
    private String vendor;

    private AddRegisteredVendorResponseBody(Builder builder) {
        this.description = builder.description;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddRegisteredVendorResponseBody create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder {
        private String description; 
        private String name; 
        private String requestId; 
        private String vendor; 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
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
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.vendor = vendor;
            return this;
        }

        public AddRegisteredVendorResponseBody build() {
            return new AddRegisteredVendorResponseBody(this);
        } 

    } 

}
