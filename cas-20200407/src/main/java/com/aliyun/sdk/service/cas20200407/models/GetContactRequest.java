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
 * {@link GetContactRequest} extends {@link RequestModel}
 *
 * <p>GetContactRequest</p>
 */
public class GetContactRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long contactId;

    private GetContactRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContactRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactId
     */
    public Long getContactId() {
        return this.contactId;
    }

    public static final class Builder extends Request.Builder<GetContactRequest, Builder> {
        private Long contactId; 

        private Builder() {
            super();
        } 

        private Builder(GetContactRequest request) {
            super(request);
            this.contactId = request.contactId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1397591</p>
         */
        public Builder contactId(Long contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        @Override
        public GetContactRequest build() {
            return new GetContactRequest(this);
        } 

    } 

}
