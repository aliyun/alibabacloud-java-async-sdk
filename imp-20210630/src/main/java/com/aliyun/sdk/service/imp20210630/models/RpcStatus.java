// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RpcStatus} extends {@link TeaModel}
 *
 * <p>RpcStatus</p>
 */
public class RpcStatus extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Detail")
    private String detail;

    @NameInMap("Message")
    private String message;

    private RpcStatus(Builder builder) {
        this.code = builder.code;
        this.detail = builder.detail;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RpcStatus create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    public static final class Builder {
        private Integer code; 
        private String detail; 
        private String message; 

        /**
         * 错误码
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * 错误详情
         */
        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        /**
         * 错误消息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public RpcStatus build() {
            return new RpcStatus(this);
        } 

    } 

}
