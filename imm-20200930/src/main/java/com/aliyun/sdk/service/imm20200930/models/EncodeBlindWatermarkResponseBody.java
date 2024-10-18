// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EncodeBlindWatermarkResponseBody} extends {@link TeaModel}
 *
 * <p>EncodeBlindWatermarkResponseBody</p>
 */
public class EncodeBlindWatermarkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private EncodeBlindWatermarkResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EncodeBlindWatermarkResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8E0DD64B-28C6-4653-8FF7-93E4C234BCF0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EncodeBlindWatermarkResponseBody build() {
            return new EncodeBlindWatermarkResponseBody(this);
        } 

    } 

}
