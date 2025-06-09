// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link GetCatalogTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetCatalogTokenResponseBody</p>
 */
public class GetCatalogTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("expiresAtMillis")
    private Long expiresAtMillis;

    @com.aliyun.core.annotation.NameInMap("token")
    private java.util.Map<String, String> token;

    private GetCatalogTokenResponseBody(Builder builder) {
        this.expiresAtMillis = builder.expiresAtMillis;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCatalogTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expiresAtMillis
     */
    public Long getExpiresAtMillis() {
        return this.expiresAtMillis;
    }

    /**
     * @return token
     */
    public java.util.Map<String, String> getToken() {
        return this.token;
    }

    public static final class Builder {
        private Long expiresAtMillis; 
        private java.util.Map<String, String> token; 

        private Builder() {
        } 

        private Builder(GetCatalogTokenResponseBody model) {
            this.expiresAtMillis = model.expiresAtMillis;
            this.token = model.token;
        } 

        /**
         * expiresAtMillis.
         */
        public Builder expiresAtMillis(Long expiresAtMillis) {
            this.expiresAtMillis = expiresAtMillis;
            return this;
        }

        /**
         * token.
         */
        public Builder token(java.util.Map<String, String> token) {
            this.token = token;
            return this;
        }

        public GetCatalogTokenResponseBody build() {
            return new GetCatalogTokenResponseBody(this);
        } 

    } 

}
