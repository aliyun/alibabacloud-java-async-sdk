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
 * {@link CreateQosPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateQosPolicyResponseBody</p>
 */
public class CreateQosPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorMessages")
    private String errorMessages;

    @com.aliyun.core.annotation.NameInMap("QosPolicyId")
    private String qosPolicyId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateQosPolicyResponseBody(Builder builder) {
        this.errorMessages = builder.errorMessages;
        this.qosPolicyId = builder.qosPolicyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQosPolicyResponseBody create() {
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
     * @return qosPolicyId
     */
    public String getQosPolicyId() {
        return this.qosPolicyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String errorMessages; 
        private String qosPolicyId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateQosPolicyResponseBody model) {
            this.errorMessages = model.errorMessages;
            this.qosPolicyId = model.qosPolicyId;
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
         * QosPolicyId.
         */
        public Builder qosPolicyId(String qosPolicyId) {
            this.qosPolicyId = qosPolicyId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateQosPolicyResponseBody build() {
            return new CreateQosPolicyResponseBody(this);
        } 

    } 

}
