// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link UpdateServiceSafetyLockResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateServiceSafetyLockResponseBody</p>
 */
public class UpdateServiceSafetyLockResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateServiceSafetyLockResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceSafetyLockResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateServiceSafetyLockResponseBody model) {
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>service safety lock updated to dangerous</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E089D584-B6F4-50C4-9902-DA2295B7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateServiceSafetyLockResponseBody build() {
            return new UpdateServiceSafetyLockResponseBody(this);
        } 

    } 

}
