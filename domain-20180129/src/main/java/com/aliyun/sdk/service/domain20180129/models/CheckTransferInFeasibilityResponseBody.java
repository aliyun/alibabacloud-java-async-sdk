// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckTransferInFeasibilityResponseBody} extends {@link TeaModel}
 *
 * <p>CheckTransferInFeasibilityResponseBody</p>
 */
public class CheckTransferInFeasibilityResponseBody extends TeaModel {
    @NameInMap("CanTransfer")
    private Boolean canTransfer;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("ProductId")
    private String productId;

    @NameInMap("RequestId")
    private String requestId;

    private CheckTransferInFeasibilityResponseBody(Builder builder) {
        this.canTransfer = builder.canTransfer;
        this.code = builder.code;
        this.message = builder.message;
        this.productId = builder.productId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckTransferInFeasibilityResponseBody create() {
        return builder().build();
    }

    /**
     * @return canTransfer
     */
    public Boolean getCanTransfer() {
        return this.canTransfer;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean canTransfer; 
        private String code; 
        private String message; 
        private String productId; 
        private String requestId; 

        /**
         * CanTransfer.
         */
        public Builder canTransfer(Boolean canTransfer) {
            this.canTransfer = canTransfer;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * ProductId.
         */
        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckTransferInFeasibilityResponseBody build() {
            return new CheckTransferInFeasibilityResponseBody(this);
        } 

    } 

}
