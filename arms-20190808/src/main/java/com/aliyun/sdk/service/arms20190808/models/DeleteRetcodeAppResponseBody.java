// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRetcodeAppResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteRetcodeAppResponseBody</p>
 */
public class DeleteRetcodeAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DeleteRetcodeAppResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRetcodeAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * 状态码。200为成功，其他状态码为异常。
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Indicates whether the Browser Monitoring task was deleted. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * 附加信息。取值说明如下：请求正常，返回success。请求异常，返回具体异常信息。
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 操作是否成功：
         * <p>
         * 
         * - `true`：操作成功
         * - `false`：操作失败
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteRetcodeAppResponseBody build() {
            return new DeleteRetcodeAppResponseBody(this);
        } 

    } 

}
