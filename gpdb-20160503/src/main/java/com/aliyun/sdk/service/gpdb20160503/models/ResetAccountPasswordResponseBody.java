// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ResetAccountPasswordResponseBody} extends {@link TeaModel}
 *
 * <p>ResetAccountPasswordResponseBody</p>
 */
public class ResetAccountPasswordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ResetAccountPasswordResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetAccountPasswordResponseBody create() {
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

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(ResetAccountPasswordResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The new password for the account. The password must be 8 to 32 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include <code>! @ # $ % ^ &amp; * ( ) _ + - =</code></p>
         * 
         * <strong>example:</strong>
         * <p>187C80FC-75C4-477C-BBF2-A368A36D041C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ResetAccountPasswordResponseBody build() {
            return new ResetAccountPasswordResponseBody(this);
        } 

    } 

}
