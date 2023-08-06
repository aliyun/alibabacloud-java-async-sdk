// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendEmailVerificationForMessageContactRequest} extends {@link RequestModel}
 *
 * <p>SendEmailVerificationForMessageContactRequest</p>
 */
public class SendEmailVerificationForMessageContactRequest extends Request {
    @Query
    @NameInMap("ContactId")
    private String contactId;

    @Query
    @NameInMap("EmailAddress")
    private String emailAddress;

    private SendEmailVerificationForMessageContactRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
        this.emailAddress = builder.emailAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendEmailVerificationForMessageContactRequest create() {
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

    /**
     * @return emailAddress
     */
    public String getEmailAddress() {
        return this.emailAddress;
    }

    public static final class Builder extends Request.Builder<SendEmailVerificationForMessageContactRequest, Builder> {
        private String contactId; 
        private String emailAddress; 

        private Builder() {
            super();
        } 

        private Builder(SendEmailVerificationForMessageContactRequest request) {
            super(request);
            this.contactId = request.contactId;
            this.emailAddress = request.emailAddress;
        } 

        /**
         * The ID of the contact.
         */
        public Builder contactId(String contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * The email address of the contact.
         * <p>
         * 
         * The specified email address must be the one you specify when you call [AddMessageContact](~~AddMessageContact~~).
         */
        public Builder emailAddress(String emailAddress) {
            this.putQueryParameter("EmailAddress", emailAddress);
            this.emailAddress = emailAddress;
            return this;
        }

        @Override
        public SendEmailVerificationForMessageContactRequest build() {
            return new SendEmailVerificationForMessageContactRequest(this);
        } 

    } 

}
