// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The value of the activation code. The value is returned only once after the CreateAccessToken operation is called and cannot be subsequently queried. Make sure that you properly save the returned value.</p>
         * 
         * <strong>example:</strong>
         * <p>B57QoTXEA2Tytr0uZWoNY5Aju5Jt****</p>
         */
        public Builder accessTokenCode(String accessTokenCode) {
            this.accessTokenCode = accessTokenCode;
            return this;
        }

        /**
         * <p>The ID of the activation code.</p>
         * 
         * <strong>example:</strong>
         * <p>at-bp1akz2zp67r0k6r****</p>
         */
        public Builder accessTokenId(String accessTokenId) {
            this.accessTokenId = accessTokenId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DB4A7EA2-6FDA-5655-B067-854532FB****</p>
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
