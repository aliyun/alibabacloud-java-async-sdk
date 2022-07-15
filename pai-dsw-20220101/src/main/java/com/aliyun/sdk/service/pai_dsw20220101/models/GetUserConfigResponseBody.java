// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserConfigResponseBody</p>
 */
public class GetUserConfigResponseBody extends TeaModel {
    @NameInMap("AccountSufficient")
    private Boolean accountSufficient;

    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetUserConfigResponseBody(Builder builder) {
        this.accountSufficient = builder.accountSufficient;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountSufficient
     */
    public Boolean getAccountSufficient() {
        return this.accountSufficient;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Boolean accountSufficient; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * 用户账号金额是否充足
         */
        public Builder accountSufficient(Boolean accountSufficient) {
            this.accountSufficient = accountSufficient;
            return this;
        }

        /**
         * 状态码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * http状态码
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * 说明
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 成功标志
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetUserConfigResponseBody build() {
            return new GetUserConfigResponseBody(this);
        } 

    } 

}
