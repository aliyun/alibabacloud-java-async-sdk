// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateYouhuiForOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateYouhuiForOrderResponseBody</p>
 */
public class CreateYouhuiForOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("YouhuiId")
    private String youhuiId;

    private CreateYouhuiForOrderResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.youhuiId = builder.youhuiId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateYouhuiForOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return youhuiId
     */
    public String getYouhuiId() {
        return this.youhuiId;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 
        private String youhuiId; 

        /**
         * <p>The response parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0688F1D2-CDA8-5617-A43C-ADAC61D80D43</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The coupon ID.</p>
         * 
         * <strong>example:</strong>
         * <p>221201******</p>
         */
        public Builder youhuiId(String youhuiId) {
            this.youhuiId = youhuiId;
            return this;
        }

        public CreateYouhuiForOrderResponseBody build() {
            return new CreateYouhuiForOrderResponseBody(this);
        } 

    } 

}
