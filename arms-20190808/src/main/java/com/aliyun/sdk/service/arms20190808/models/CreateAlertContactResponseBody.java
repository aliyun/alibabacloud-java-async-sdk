// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAlertContactResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAlertContactResponseBody</p>
 */
public class CreateAlertContactResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContactId")
    private String contactId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAlertContactResponseBody(Builder builder) {
        this.contactId = builder.contactId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlertContactResponseBody create() {
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
         * The ID of the alert contact.
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

        public CreateAlertContactResponseBody build() {
            return new CreateAlertContactResponseBody(this);
        } 

    } 

}
