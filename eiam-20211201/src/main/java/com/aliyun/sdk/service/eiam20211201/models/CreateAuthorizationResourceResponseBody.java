// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link CreateAuthorizationResourceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAuthorizationResourceResponseBody</p>
 */
public class CreateAuthorizationResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizationResourceId")
    private String authorizationResourceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAuthorizationResourceResponseBody(Builder builder) {
        this.authorizationResourceId = builder.authorizationResourceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAuthorizationResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationResourceId
     */
    public String getAuthorizationResourceId() {
        return this.authorizationResourceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String authorizationResourceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateAuthorizationResourceResponseBody model) {
            this.authorizationResourceId = model.authorizationResourceId;
            this.requestId = model.requestId;
        } 

        /**
         * AuthorizationResourceId.
         */
        public Builder authorizationResourceId(String authorizationResourceId) {
            this.authorizationResourceId = authorizationResourceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAuthorizationResourceResponseBody build() {
            return new CreateAuthorizationResourceResponseBody(this);
        } 

    } 

}
