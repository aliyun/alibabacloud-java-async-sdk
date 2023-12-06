// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProductVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteProductVersionResponseBody</p>
 */
public class DeleteProductVersionResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("msg")
    private String msg;

    @NameInMap("requestId")
    private String requestId;

    private DeleteProductVersionResponseBody(Builder builder) {
        this.code = builder.code;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProductVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String msg; 
        private String requestId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteProductVersionResponseBody build() {
            return new DeleteProductVersionResponseBody(this);
        } 

    } 

}
