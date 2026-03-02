// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link AuthorizationResource} extends {@link TeaModel}
 *
 * <p>AuthorizationResource</p>
 */
public class AuthorizationResource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authorizerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorizerId;

    @com.aliyun.core.annotation.NameInMap("authorizerType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorizerType;

    private AuthorizationResource(Builder builder) {
        this.authorizerId = builder.authorizerId;
        this.authorizerType = builder.authorizerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizationResource create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizerId
     */
    public String getAuthorizerId() {
        return this.authorizerId;
    }

    /**
     * @return authorizerType
     */
    public String getAuthorizerType() {
        return this.authorizerType;
    }

    public static final class Builder {
        private String authorizerId; 
        private String authorizerType; 

        private Builder() {
        } 

        private Builder(AuthorizationResource model) {
            this.authorizerId = model.authorizerId;
            this.authorizerType = model.authorizerType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder authorizerId(String authorizerId) {
            this.authorizerId = authorizerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>developer</p>
         */
        public Builder authorizerType(String authorizerType) {
            this.authorizerType = authorizerType;
            return this;
        }

        public AuthorizationResource build() {
            return new AuthorizationResource(this);
        } 

    } 

}
