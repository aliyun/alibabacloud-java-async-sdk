// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectImageCroppingResponseBody} extends {@link TeaModel}
 *
 * <p>DetectImageCroppingResponseBody</p>
 */
public class DetectImageCroppingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Croppings")
    private java.util.List < CroppingSuggestion > croppings;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DetectImageCroppingResponseBody(Builder builder) {
        this.croppings = builder.croppings;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectImageCroppingResponseBody create() {
        return builder().build();
    }

    /**
     * @return croppings
     */
    public java.util.List < CroppingSuggestion > getCroppings() {
        return this.croppings;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < CroppingSuggestion > croppings; 
        private String requestId; 

        /**
         * Croppings.
         */
        public Builder croppings(java.util.List < CroppingSuggestion > croppings) {
            this.croppings = croppings;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DetectImageCroppingResponseBody build() {
            return new DetectImageCroppingResponseBody(this);
        } 

    } 

}
