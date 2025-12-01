// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link CancelChatResponseBody} extends {@link TeaModel}
 *
 * <p>CancelChatResponseBody</p>
 */
public class CancelChatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CancelResult")
    private Boolean cancelResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CancelChatResponseBody(Builder builder) {
        this.cancelResult = builder.cancelResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelChatResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cancelResult
     */
    public Boolean getCancelResult() {
        return this.cancelResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean cancelResult; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CancelChatResponseBody model) {
            this.cancelResult = model.cancelResult;
            this.requestId = model.requestId;
        } 

        /**
         * CancelResult.
         */
        public Builder cancelResult(Boolean cancelResult) {
            this.cancelResult = cancelResult;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CancelChatResponseBody build() {
            return new CancelChatResponseBody(this);
        } 

    } 

}
