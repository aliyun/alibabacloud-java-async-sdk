// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link CreateAuthorizationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAuthorizationResponseBody</p>
 */
public class CreateAuthorizationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authorizationId")
    private String authorizationId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateAuthorizationResponseBody(Builder builder) {
        this.authorizationId = builder.authorizationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAuthorizationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationId
     */
    public String getAuthorizationId() {
        return this.authorizationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String authorizationId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateAuthorizationResponseBody model) {
            this.authorizationId = model.authorizationId;
            this.requestId = model.requestId;
        } 

        /**
         * authorizationId.
         */
        public Builder authorizationId(String authorizationId) {
            this.authorizationId = authorizationId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAuthorizationResponseBody build() {
            return new CreateAuthorizationResponseBody(this);
        } 

    } 

}
