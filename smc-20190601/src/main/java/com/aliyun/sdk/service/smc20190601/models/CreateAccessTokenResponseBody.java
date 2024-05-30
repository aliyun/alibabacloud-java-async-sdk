// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccessTokenResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAccessTokenResponseBody</p>
 */
public class CreateAccessTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessTokenCode")
    private String accessTokenCode;

    @com.aliyun.core.annotation.NameInMap("AccessTokenId")
    private String accessTokenId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAccessTokenResponseBody(Builder builder) {
        this.accessTokenCode = builder.accessTokenCode;
        this.accessTokenId = builder.accessTokenId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccessTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessTokenCode
     */
    public String getAccessTokenCode() {
        return this.accessTokenCode;
    }

    /**
     * @return accessTokenId
     */
    public String getAccessTokenId() {
        return this.accessTokenId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessTokenCode; 
        private String accessTokenId; 
        private String requestId; 

        /**
         * The value of the activation code. The value is returned only once after the CreateAccessToken operation is called and cannot be subsequently queried. Make sure that you properly save the returned value.
         */
        public Builder accessTokenCode(String accessTokenCode) {
            this.accessTokenCode = accessTokenCode;
            return this;
        }

        /**
         * The ID of the activation code.
         */
        public Builder accessTokenId(String accessTokenId) {
            this.accessTokenId = accessTokenId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAccessTokenResponseBody build() {
            return new CreateAccessTokenResponseBody(this);
        } 

    } 

}
