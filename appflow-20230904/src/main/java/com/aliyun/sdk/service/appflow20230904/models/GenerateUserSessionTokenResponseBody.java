// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appflow20230904.models;

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
 * {@link GenerateUserSessionTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateUserSessionTokenResponseBody</p>
 */
public class GenerateUserSessionTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserSessionToken")
    private String userSessionToken;

    private GenerateUserSessionTokenResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userSessionToken = builder.userSessionToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateUserSessionTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userSessionToken
     */
    public String getUserSessionToken() {
        return this.userSessionToken;
    }

    public static final class Builder {
        private String requestId; 
        private String userSessionToken; 

        private Builder() {
        } 

        private Builder(GenerateUserSessionTokenResponseBody model) {
            this.requestId = model.requestId;
            this.userSessionToken = model.userSessionToken;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>34C2713A-2270-5EEC-825E-115F9AD3BAC9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Token.</p>
         * 
         * <strong>example:</strong>
         * <p>960f499au184m7****</p>
         */
        public Builder userSessionToken(String userSessionToken) {
            this.userSessionToken = userSessionToken;
            return this;
        }

        public GenerateUserSessionTokenResponseBody build() {
            return new GenerateUserSessionTokenResponseBody(this);
        } 

    } 

}
