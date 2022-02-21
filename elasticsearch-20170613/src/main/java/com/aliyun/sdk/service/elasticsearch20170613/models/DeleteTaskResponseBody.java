// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteTaskResponseBody</p>
 */
public class DeleteTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteTaskResponseBody build() {
            return new DeleteTaskResponseBody(this);
        } 

    } 

}
