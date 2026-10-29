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
 * {@link CreateContactResponseBody} extends {@link TeaModel}
 *
 * <p>CreateContactResponseBody</p>
 */
public class CreateContactResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("contactId")
    private String contactId;

    @com.aliyun.core.annotation.NameInMap("requestId")
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

        private Builder() {
        } 

        private Builder(CreateContactResponseBody model) {
            this.contactId = model.contactId;
            this.requestId = model.requestId;
        } 

        /**
         * contactId.
         */
        public Builder contactId(String contactId) {
            this.contactId = contactId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>8FDE2569-626B-5176-9844-28877A*****</p>
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
