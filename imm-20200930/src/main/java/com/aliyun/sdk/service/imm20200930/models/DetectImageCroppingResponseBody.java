// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link DetectImageCroppingResponseBody} extends {@link TeaModel}
 *
 * <p>DetectImageCroppingResponseBody</p>
 */
public class DetectImageCroppingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Croppings")
    private java.util.List<CroppingSuggestion> croppings;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return croppings
     */
    public java.util.List<CroppingSuggestion> getCroppings() {
        return this.croppings;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<CroppingSuggestion> croppings; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DetectImageCroppingResponseBody model) {
            this.croppings = model.croppings;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The image cropping suggestions.</p>
         */
        public Builder croppings(java.util.List<CroppingSuggestion> croppings) {
            this.croppings = croppings;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>91AC8C98-0F36-49D2-8290-742E24D*****</p>
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
