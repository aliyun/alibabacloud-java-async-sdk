// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link DeleteCollectionPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteCollectionPolicyResponseBody</p>
 */
public class DeleteCollectionPolicyResponseBody extends TeaModel {
    @NameInMap("message")
    private String message;

    private DeleteCollectionPolicyResponseBody(Builder builder) {
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCollectionPolicyResponseBody create() {
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

        public DeleteCollectionPolicyResponseBody build() {
            return new DeleteCollectionPolicyResponseBody(this);
        } 

    } 

}
