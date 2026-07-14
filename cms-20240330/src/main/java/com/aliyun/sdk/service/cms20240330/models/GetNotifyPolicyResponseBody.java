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
 * {@link GetNotifyPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetNotifyPolicyResponseBody</p>
 */
public class GetNotifyPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("notifyPolicy")
    private NotifyPolicy notifyPolicy;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetNotifyPolicyResponseBody(Builder builder) {
        this.notifyPolicy = builder.notifyPolicy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNotifyPolicyResponseBody create() {
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

        private Builder(GetNotifyPolicyResponseBody model) {
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0B9377D9-C56B-5C2E-A8A4-A01D6CC3F4B8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNotifyPolicyResponseBody build() {
            return new GetNotifyPolicyResponseBody(this);
        } 

    } 

}
