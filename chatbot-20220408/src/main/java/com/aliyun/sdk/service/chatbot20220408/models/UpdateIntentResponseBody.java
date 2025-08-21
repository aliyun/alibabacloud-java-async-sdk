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
 * {@link UpdateIntentResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateIntentResponseBody</p>
 */
public class UpdateIntentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IntentId")
    private Long intentId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateIntentResponseBody(Builder builder) {
        this.intentId = builder.intentId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIntentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return intentId
     */
    public Long getIntentId() {
        return this.intentId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long intentId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateIntentResponseBody model) {
            this.intentId = model.intentId;
            this.requestId = model.requestId;
        } 

        /**
         * IntentId.
         */
        public Builder intentId(Long intentId) {
            this.intentId = intentId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateIntentResponseBody build() {
            return new UpdateIntentResponseBody(this);
        } 

    } 

}
