// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210218.models;

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
 * {@link CreateThirdAppAccessTokenResponseBody} extends {@link TeaModel}
 *
 * <p>CreateThirdAppAccessTokenResponseBody</p>
 */
public class CreateThirdAppAccessTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessToken")
    private String accessToken;

    @com.aliyun.core.annotation.NameInMap("ExpiresAt")
    private Long expiresAt;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateThirdAppAccessTokenResponseBody(Builder builder) {
        this.accessToken = builder.accessToken;
        this.expiresAt = builder.expiresAt;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateThirdAppAccessTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return expiresAt
     */
    public Long getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessToken; 
        private Long expiresAt; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateThirdAppAccessTokenResponseBody model) {
            this.accessToken = model.accessToken;
            this.expiresAt = model.expiresAt;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The time-limited static access token created for the specified user and single cloud desktop. This is a sensitive credential. Do not log or expose the full value.</p>
         * 
         * <strong>example:</strong>
         * <p>taatv1.v2****</p>
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * <p>The absolute expiration time of the token, in UNIX milliseconds. This parameter is not empty when the call is successful. GetLatestThirdAppAccessToken returns the original expiration time without extending it.</p>
         * 
         * <strong>example:</strong>
         * <p>1795450500000</p>
         */
        public Builder expiresAt(Long expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * <p>The unique identifier of the request, which can be used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>6DAB2D15-7345-4C33-9D77-48A1A756B9E1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateThirdAppAccessTokenResponseBody build() {
            return new CreateThirdAppAccessTokenResponseBody(this);
        } 

    } 

}
