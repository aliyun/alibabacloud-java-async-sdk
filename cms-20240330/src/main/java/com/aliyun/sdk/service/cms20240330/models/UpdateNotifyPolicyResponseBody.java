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
 * {@link UpdateNotifyPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateNotifyPolicyResponseBody</p>
 */
public class UpdateNotifyPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("notifyPolicy")
    private NotifyPolicy notifyPolicy;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private UpdateNotifyPolicyResponseBody(Builder builder) {
        this.notifyPolicy = builder.notifyPolicy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNotifyPolicyResponseBody create() {
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

        private Builder(UpdateNotifyPolicyResponseBody model) {
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

        public UpdateNotifyPolicyResponseBody build() {
            return new UpdateNotifyPolicyResponseBody(this);
        } 

    } 

}
