// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRandomPasswordResponseBody} extends {@link TeaModel}
 *
 * <p>GetRandomPasswordResponseBody</p>
 */
public class GetRandomPasswordResponseBody extends TeaModel {
    @NameInMap("RandomPassword")
    private String randomPassword;

    @NameInMap("RequestId")
    private String requestId;

    private GetRandomPasswordResponseBody(Builder builder) {
        this.randomPassword = builder.randomPassword;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRandomPasswordResponseBody create() {
        return builder().build();
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

        /**
         * The generated random password.
         */
        public Builder randomPassword(String randomPassword) {
            this.randomPassword = randomPassword;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRandomPasswordResponseBody build() {
            return new GetRandomPasswordResponseBody(this);
        } 

    } 

}
