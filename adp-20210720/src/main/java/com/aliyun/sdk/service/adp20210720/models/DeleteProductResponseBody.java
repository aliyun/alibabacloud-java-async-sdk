// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProductResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteProductResponseBody</p>
 */
public class DeleteProductResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("msg")
    private String msg;

    private DeleteProductResponseBody(Builder builder) {
        this.code = builder.code;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProductResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private String msg; 

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

        public DeleteProductResponseBody build() {
            return new DeleteProductResponseBody(this);
        } 

    } 

}
