// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteContactRequest} extends {@link RequestModel}
 *
 * <p>DeleteContactRequest</p>
 */
public class DeleteContactRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long contactId;

    private DeleteContactRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteContactRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteContactRequest, Builder> {
        private Long contactId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteContactRequest request) {
            super(request);
            this.contactId = request.contactId;
        } 

        /**
         * The operation that you want to perform. Set the value to **DeleteContact**.
         */
        public Builder contactId(Long contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        @Override
        public DeleteContactRequest build() {
            return new DeleteContactRequest(this);
        } 

    } 

}
