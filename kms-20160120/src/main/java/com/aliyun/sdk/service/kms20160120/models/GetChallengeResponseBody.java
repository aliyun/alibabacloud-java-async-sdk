// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link GetChallengeResponseBody} extends {@link TeaModel}
 *
 * <p>GetChallengeResponseBody</p>
 */
public class GetChallengeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChallengeToken")
    private String challengeToken;

    @com.aliyun.core.annotation.NameInMap("Nonce")
    private String nonce;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetChallengeResponseBody(Builder builder) {
        this.challengeToken = builder.challengeToken;
        this.nonce = builder.nonce;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChallengeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return challengeToken
     */
    public String getChallengeToken() {
        return this.challengeToken;
    }

    /**
     * @return nonce
     */
    public String getNonce() {
        return this.nonce;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String challengeToken; 
        private String nonce; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetChallengeResponseBody model) {
            this.challengeToken = model.challengeToken;
            this.nonce = model.nonce;
            this.requestId = model.requestId;
        } 

        /**
         * ChallengeToken.
         */
        public Builder challengeToken(String challengeToken) {
            this.challengeToken = challengeToken;
            return this;
        }

        /**
         * Nonce.
         */
        public Builder nonce(String nonce) {
            this.nonce = nonce;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetChallengeResponseBody build() {
            return new GetChallengeResponseBody(this);
        } 

    } 

}
