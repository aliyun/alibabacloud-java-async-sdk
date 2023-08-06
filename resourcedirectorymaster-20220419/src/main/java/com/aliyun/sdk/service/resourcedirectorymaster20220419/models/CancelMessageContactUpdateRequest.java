// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelMessageContactUpdateRequest} extends {@link RequestModel}
 *
 * <p>CancelMessageContactUpdateRequest</p>
 */
public class CancelMessageContactUpdateRequest extends Request {
    @Query
    @NameInMap("ContactId")
    private String contactId;

    @Query
    @NameInMap("EmailAddress")
    private String emailAddress;

    @Query
    @NameInMap("PhoneNumber")
    private String phoneNumber;

    private CancelMessageContactUpdateRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
        this.emailAddress = builder.emailAddress;
        this.phoneNumber = builder.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelMessageContactUpdateRequest create() {
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

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public static final class Builder extends Request.Builder<CancelMessageContactUpdateRequest, Builder> {
        private String contactId; 
        private String emailAddress; 
        private String phoneNumber; 

        private Builder() {
            super();
        } 

        private Builder(CancelMessageContactUpdateRequest request) {
            super(request);
            this.contactId = request.contactId;
            this.emailAddress = request.emailAddress;
            this.phoneNumber = request.phoneNumber;
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
         */
        public Builder emailAddress(String emailAddress) {
            this.putQueryParameter("EmailAddress", emailAddress);
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * The mobile phone number of the contact.
         * <p>
         * 
         * Specify the mobile phone number in the `<Country code>-<Mobile phone number>` format.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        @Override
        public CancelMessageContactUpdateRequest build() {
            return new CancelMessageContactUpdateRequest(this);
        } 

    } 

}
