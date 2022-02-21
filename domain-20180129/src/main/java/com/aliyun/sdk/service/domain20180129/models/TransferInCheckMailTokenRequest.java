// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransferInCheckMailTokenRequest} extends {@link RequestModel}
 *
 * <p>TransferInCheckMailTokenRequest</p>
 */
public class TransferInCheckMailTokenRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Token")
    @Validation(required = true)
    private String token;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private TransferInCheckMailTokenRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.token = builder.token;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferInCheckMailTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<TransferInCheckMailTokenRequest, Builder> {
        private String lang; 
        private String token; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(TransferInCheckMailTokenRequest response) {
            super(response);
            this.lang = response.lang;
            this.token = response.token;
            this.userClientIp = response.userClientIp;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public TransferInCheckMailTokenRequest build() {
            return new TransferInCheckMailTokenRequest(this);
        } 

    } 

}
