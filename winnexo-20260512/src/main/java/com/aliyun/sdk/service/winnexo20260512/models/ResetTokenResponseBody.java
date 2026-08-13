// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ResetTokenResponseBody} extends {@link TeaModel}
 *
 * <p>ResetTokenResponseBody</p>
 */
public class ResetTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("token")
    private String token;

    @com.aliyun.core.annotation.NameInMap("tokenMasked")
    private String tokenMasked;

    private ResetTokenResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.token = builder.token;
        this.tokenMasked = builder.tokenMasked;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetTokenResponseBody create() {
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
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return tokenMasked
     */
    public String getTokenMasked() {
        return this.tokenMasked;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private String token; 
        private String tokenMasked; 

        private Builder() {
        } 

        private Builder(ResetTokenResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.token = model.token;
            this.tokenMasked = model.tokenMasked;
        } 

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>新 Token 明文（仅本次返回，请妥善保管）</p>
         * 
         * <strong>example:</strong>
         * <p>example_token_value</p>
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * <p>脱敏后的新 Token 值</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder tokenMasked(String tokenMasked) {
            this.tokenMasked = tokenMasked;
            return this;
        }

        public ResetTokenResponseBody build() {
            return new ResetTokenResponseBody(this);
        } 

    } 

}
