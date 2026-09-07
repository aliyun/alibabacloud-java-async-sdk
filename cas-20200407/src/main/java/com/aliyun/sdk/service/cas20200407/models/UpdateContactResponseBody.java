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
 * {@link UpdateContactResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateContactResponseBody</p>
 */
public class UpdateContactResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContactId")
    private Long contactId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateContactResponseBody(Builder builder) {
        this.contactId = builder.contactId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateContactResponseBody create() {
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

        private Builder(UpdateContactResponseBody model) {
            this.contactId = model.contactId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The contact ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1352570</p>
         */
        public Builder contactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>71CE8C5B-3737-52A9-97D0-2A9746059A45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateContactResponseBody build() {
            return new UpdateContactResponseBody(this);
        } 

    } 

}
