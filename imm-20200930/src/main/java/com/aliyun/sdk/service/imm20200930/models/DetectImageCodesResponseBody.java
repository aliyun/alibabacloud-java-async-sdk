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
 * {@link DetectImageCodesResponseBody} extends {@link TeaModel}
 *
 * <p>DetectImageCodesResponseBody</p>
 */
public class DetectImageCodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Codes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Codes> codes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DetectImageCodesResponseBody(Builder builder) {
        this.codes = builder.codes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectImageCodesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codes
     */
    public java.util.List<Codes> getCodes() {
        return this.codes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Codes> codes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DetectImageCodesResponseBody model) {
            this.codes = model.codes;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The barcodes or QR codes.</p>
         * <p>This parameter is required.</p>
         */
        public Builder codes(java.util.List<Codes> codes) {
            this.codes = codes;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6E93D6C9-5AC0-49F9-914D-E02678D3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DetectImageCodesResponseBody build() {
            return new DetectImageCodesResponseBody(this);
        } 

    } 

}
