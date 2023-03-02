// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20150303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RpcNoDefaultErrorCodeApiResponseBody} extends {@link TeaModel}
 *
 * <p>RpcNoDefaultErrorCodeApiResponseBody</p>
 */
public class RpcNoDefaultErrorCodeApiResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Success")
    private String success;

    private RpcNoDefaultErrorCodeApiResponseBody(Builder builder) {
        this.code = builder.code;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RpcNoDefaultErrorCodeApiResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public RpcNoDefaultErrorCodeApiResponseBody build() {
            return new RpcNoDefaultErrorCodeApiResponseBody(this);
        } 

    } 

}
