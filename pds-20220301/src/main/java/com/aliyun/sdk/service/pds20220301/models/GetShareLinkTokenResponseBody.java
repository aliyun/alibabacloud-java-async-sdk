// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetShareLinkTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetShareLinkTokenResponseBody</p>
 */
public class GetShareLinkTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("expires_in")
    private Long expiresIn;

    @com.aliyun.core.annotation.NameInMap("share_token")
    private String shareToken;

    private GetShareLinkTokenResponseBody(Builder builder) {
        this.expiresIn = builder.expiresIn;
        this.shareToken = builder.shareToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetShareLinkTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return expiresIn
     */
    public Long getExpiresIn() {
        return this.expiresIn;
    }

    /**
     * @return shareToken
     */
    public String getShareToken() {
        return this.shareToken;
    }

    public static final class Builder {
        private Long expiresIn; 
        private String shareToken; 

        /**
         * The validity period of the token. Unit: seconds. For example, a value of 7200 indicates two hours.
         */
        public Builder expiresIn(Long expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }

        /**
         * The JSON Web Token (JWT).
         */
        public Builder shareToken(String shareToken) {
            this.shareToken = shareToken;
            return this;
        }

        public GetShareLinkTokenResponseBody build() {
            return new GetShareLinkTokenResponseBody(this);
        } 

    } 

}
