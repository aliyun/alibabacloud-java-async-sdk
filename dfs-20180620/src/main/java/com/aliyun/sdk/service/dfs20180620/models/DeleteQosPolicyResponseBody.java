// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

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
 * {@link DeleteQosPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteQosPolicyResponseBody</p>
 */
public class DeleteQosPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorMessages")
    private String errorMessages;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteQosPolicyResponseBody(Builder builder) {
        this.errorMessages = builder.errorMessages;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteQosPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorMessages
     */
    public String getErrorMessages() {
        return this.errorMessages;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String errorMessages; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteQosPolicyResponseBody model) {
            this.errorMessages = model.errorMessages;
            this.requestId = model.requestId;
        } 

        /**
         * ErrorMessages.
         */
        public Builder errorMessages(String errorMessages) {
            this.errorMessages = errorMessages;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteQosPolicyResponseBody build() {
            return new DeleteQosPolicyResponseBody(this);
        } 

    } 

}
