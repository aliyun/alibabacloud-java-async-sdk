// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpsertCollectionPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>UpsertCollectionPolicyResponseBody</p>
 */
public class UpsertCollectionPolicyResponseBody extends TeaModel {
    @NameInMap("message")
    private String message;

    private UpsertCollectionPolicyResponseBody(Builder builder) {
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpsertCollectionPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    public static final class Builder {
        private String message; 

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public UpsertCollectionPolicyResponseBody build() {
            return new UpsertCollectionPolicyResponseBody(this);
        } 

    } 

}
