// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link CreateProjectAuthorizationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProjectAuthorizationResponseBody</p>
 */
public class CreateProjectAuthorizationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizationId")
    private String authorizationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateProjectAuthorizationResponseBody(Builder builder) {
        this.authorizationId = builder.authorizationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectAuthorizationResponseBody create() {
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

        private Builder(CreateProjectAuthorizationResponseBody model) {
            this.authorizationId = model.authorizationId;
            this.requestId = model.requestId;
        } 

        /**
         * AuthorizationId.
         */
        public Builder authorizationId(String authorizationId) {
            this.authorizationId = authorizationId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateProjectAuthorizationResponseBody build() {
            return new CreateProjectAuthorizationResponseBody(this);
        } 

    } 

}
