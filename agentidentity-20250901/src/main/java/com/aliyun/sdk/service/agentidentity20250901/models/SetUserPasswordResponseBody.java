// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link SetUserPasswordResponseBody} extends {@link TeaModel}
 *
 * <p>SetUserPasswordResponseBody</p>
 */
public class SetUserPasswordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RandomPassword")
    private String randomPassword;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetUserPasswordResponseBody(Builder builder) {
        this.randomPassword = builder.randomPassword;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetUserPasswordResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return randomPassword
     */
    public String getRandomPassword() {
        return this.randomPassword;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String randomPassword; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SetUserPasswordResponseBody model) {
            this.randomPassword = model.randomPassword;
            this.requestId = model.requestId;
        } 

        /**
         * RandomPassword.
         */
        public Builder randomPassword(String randomPassword) {
            this.randomPassword = randomPassword;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetUserPasswordResponseBody build() {
            return new SetUserPasswordResponseBody(this);
        } 

    } 

}
