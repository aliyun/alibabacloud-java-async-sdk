// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWebhookResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWebhookResponseBody</p>
 */
public class CreateWebhookResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContactId")
    private String contactId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateWebhookResponseBody(Builder builder) {
        this.contactId = builder.contactId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWebhookResponseBody create() {
        return builder().build();
    }

    /**
     * @return contactId
     */
    public String getContactId() {
        return this.contactId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String contactId; 
        private String requestId; 

        /**
         * The ID of the contact for webhook alerts.
         */
        public Builder contactId(String contactId) {
            this.contactId = contactId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateWebhookResponseBody build() {
            return new CreateWebhookResponseBody(this);
        } 

    } 

}
