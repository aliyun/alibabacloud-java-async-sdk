// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CreateNotifyPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNotifyPolicyResponseBody</p>
 */
public class CreateNotifyPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("notifyPolicy")
    private NotifyPolicy notifyPolicy;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateNotifyPolicyResponseBody(Builder builder) {
        this.notifyPolicy = builder.notifyPolicy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNotifyPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return notifyPolicy
     */
    public NotifyPolicy getNotifyPolicy() {
        return this.notifyPolicy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private NotifyPolicy notifyPolicy; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateNotifyPolicyResponseBody model) {
            this.notifyPolicy = model.notifyPolicy;
            this.requestId = model.requestId;
        } 

        /**
         * notifyPolicy.
         */
        public Builder notifyPolicy(NotifyPolicy notifyPolicy) {
            this.notifyPolicy = notifyPolicy;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNotifyPolicyResponseBody build() {
            return new CreateNotifyPolicyResponseBody(this);
        } 

    } 

}
