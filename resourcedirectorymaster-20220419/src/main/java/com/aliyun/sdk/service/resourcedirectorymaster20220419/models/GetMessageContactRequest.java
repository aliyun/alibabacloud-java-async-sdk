// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMessageContactRequest} extends {@link RequestModel}
 *
 * <p>GetMessageContactRequest</p>
 */
public class GetMessageContactRequest extends Request {
    @Query
    @NameInMap("ContactId")
    @Validation(required = true)
    private String contactId;

    private GetMessageContactRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessageContactRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactId
     */
    public String getContactId() {
        return this.contactId;
    }

    public static final class Builder extends Request.Builder<GetMessageContactRequest, Builder> {
        private String contactId; 

        private Builder() {
            super();
        } 

        private Builder(GetMessageContactRequest request) {
            super(request);
            this.contactId = request.contactId;
        } 

        /**
         * The ID of the contact.
         */
        public Builder contactId(String contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        @Override
        public GetMessageContactRequest build() {
            return new GetMessageContactRequest(this);
        } 

    } 

}
