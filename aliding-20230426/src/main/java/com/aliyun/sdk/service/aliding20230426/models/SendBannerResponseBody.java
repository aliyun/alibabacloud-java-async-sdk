// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendBannerResponseBody} extends {@link TeaModel}
 *
 * <p>SendBannerResponseBody</p>
 */
public class SendBannerResponseBody extends TeaModel {
    @NameInMap("arguments")
    private java.util.List < ? > arguments;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("vendorRequestId")
    private String vendorRequestId;

    @NameInMap("vendorType")
    private String vendorType;

    private SendBannerResponseBody(Builder builder) {
        this.arguments = builder.arguments;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendBannerResponseBody create() {
        return builder().build();
    }

    /**
     * @return arguments
     */
    public java.util.List < ? > getArguments() {
        return this.arguments;
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

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private java.util.List < ? > arguments; 
        private String requestId; 
        private Boolean success; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * arguments.
         */
        public Builder arguments(java.util.List < ? > arguments) {
            this.arguments = arguments;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public SendBannerResponseBody build() {
            return new SendBannerResponseBody(this);
        } 

    } 

}
