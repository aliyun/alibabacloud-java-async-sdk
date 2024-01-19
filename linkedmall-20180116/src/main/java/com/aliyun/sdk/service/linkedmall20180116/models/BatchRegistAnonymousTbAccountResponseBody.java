// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchRegistAnonymousTbAccountResponseBody} extends {@link TeaModel}
 *
 * <p>BatchRegistAnonymousTbAccountResponseBody</p>
 */
public class BatchRegistAnonymousTbAccountResponseBody extends TeaModel {
    @NameInMap("BatchId")
    private String batchId;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private BatchRegistAnonymousTbAccountResponseBody(Builder builder) {
        this.batchId = builder.batchId;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchRegistAnonymousTbAccountResponseBody create() {
        return builder().build();
    }

    /**
     * @return batchId
     */
    public String getBatchId() {
        return this.batchId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String batchId; 
        private String code; 
        private String message; 
        private String requestId; 

        /**
         * BatchId.
         */
        public Builder batchId(String batchId) {
            this.batchId = batchId;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchRegistAnonymousTbAccountResponseBody build() {
            return new BatchRegistAnonymousTbAccountResponseBody(this);
        } 

    } 

}
