// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link CreateContactResponseBody} extends {@link TeaModel}
 *
 * <p>CreateContactResponseBody</p>
 */
public class CreateContactResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContactId")
    private Long contactId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateContactResponseBody(Builder builder) {
        this.contactId = builder.contactId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContactResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactId
     */
    public Long getContactId() {
        return this.contactId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long contactId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateContactResponseBody model) {
            this.contactId = model.contactId;
            this.requestId = model.requestId;
        } 

        /**
         * ContactId.
         */
        public Builder contactId(Long contactId) {
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

        public CreateContactResponseBody build() {
            return new CreateContactResponseBody(this);
        } 

    } 

}
