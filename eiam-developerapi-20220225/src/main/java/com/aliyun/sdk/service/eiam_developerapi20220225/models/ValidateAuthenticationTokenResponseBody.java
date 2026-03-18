// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.sdk.gateway.eiam.dev.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * 
 * {@link ValidateAuthenticationTokenResponseBody} extends {@link TeaModel}
 *
 * <p>ValidateAuthenticationTokenResponseBody</p>
 */
public class ValidateAuthenticationTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("active")
    private Boolean active;

    private ValidateAuthenticationTokenResponseBody(Builder builder) {
        this.active = builder.active;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateAuthenticationTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return active
     */
    public Boolean getActive() {
        return this.active;
    }

    public static final class Builder {
        private Boolean active; 

        private Builder() {
        } 

        private Builder(ValidateAuthenticationTokenResponseBody model) {
            this.active = model.active;
        } 

        /**
         * active.
         */
        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }

        public ValidateAuthenticationTokenResponseBody build() {
            return new ValidateAuthenticationTokenResponseBody(this);
        } 

    } 

}
