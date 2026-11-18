// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link UpdateWarmPoolResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateWarmPoolResponseBody</p>
 */
public class UpdateWarmPoolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("warmPool")
    private PublicWarmPoolConfig warmPool;

    private UpdateWarmPoolResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.warmPool = builder.warmPool;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWarmPoolResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return warmPool
     */
    public PublicWarmPoolConfig getWarmPool() {
        return this.warmPool;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private PublicWarmPoolConfig warmPool; 

        private Builder() {
        } 

        private Builder(UpdateWarmPoolResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.warmPool = model.warmPool;
        } 

        /**
         * <p>The business code in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>01234567-89AB-CDEF-0123-456789ABCDEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The warm pool configuration or current status.</p>
         */
        public Builder warmPool(PublicWarmPoolConfig warmPool) {
            this.warmPool = warmPool;
            return this;
        }

        public UpdateWarmPoolResponseBody build() {
            return new UpdateWarmPoolResponseBody(this);
        } 

    } 

}
