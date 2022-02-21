// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyBoardTokenResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyBoardTokenResponseBody</p>
 */
public class ApplyBoardTokenResponseBody extends TeaModel {
    @NameInMap("Expired")
    private String expired;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Token")
    private String token;

    private ApplyBoardTokenResponseBody(Builder builder) {
        this.expired = builder.expired;
        this.requestId = builder.requestId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyBoardTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return expired
     */
    public String getExpired() {
        return this.expired;
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

    public static final class Builder {
        private String expired; 
        private String requestId; 
        private String token; 

        /**
         * Expired.
         */
        public Builder expired(String expired) {
            this.expired = expired;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public ApplyBoardTokenResponseBody build() {
            return new ApplyBoardTokenResponseBody(this);
        } 

    } 

}
