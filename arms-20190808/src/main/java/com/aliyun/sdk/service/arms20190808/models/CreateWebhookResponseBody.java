// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWebhookResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWebhookResponseBody</p>
 */
public class CreateWebhookResponseBody extends TeaModel {
    @NameInMap("ContactId")
    private String contactId;

    @NameInMap("RequestId")
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
         * ContactId.
         */
        public Builder contactId(String contactId) {
            this.contactId = contactId;
            return this;
        }

        /**
         * RequestId.
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
