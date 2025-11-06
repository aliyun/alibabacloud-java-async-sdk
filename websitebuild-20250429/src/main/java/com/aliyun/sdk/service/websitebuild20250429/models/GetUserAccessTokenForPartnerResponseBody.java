// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link GetUserAccessTokenForPartnerResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserAccessTokenForPartnerResponseBody</p>
 */
public class GetUserAccessTokenForPartnerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetUserAccessTokenForPartnerResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserAccessTokenForPartnerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private Module module; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(GetUserAccessTokenForPartnerResponseBody model) {
            this.errorCode = model.errorCode;
            this.module = model.module;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetUserAccessTokenForPartnerResponseBody build() {
            return new GetUserAccessTokenForPartnerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserAccessTokenForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserAccessTokenForPartnerResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TokenValue")
        private String tokenValue;

        private Module(Builder builder) {
            this.tokenValue = builder.tokenValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return tokenValue
         */
        public String getTokenValue() {
            return this.tokenValue;
        }

        public static final class Builder {
            private String tokenValue; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.tokenValue = model.tokenValue;
            } 

            /**
             * TokenValue.
             */
            public Builder tokenValue(String tokenValue) {
                this.tokenValue = tokenValue;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
