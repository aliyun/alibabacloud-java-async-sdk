// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMessageContactRequest} extends {@link RequestModel}
 *
 * <p>UpdateMessageContactRequest</p>
 */
public class UpdateMessageContactRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactId")
    private String contactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmailAddress")
    private String emailAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageTypes")
    private java.util.List < String > messageTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private UpdateMessageContactRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
        this.emailAddress = builder.emailAddress;
        this.messageTypes = builder.messageTypes;
        this.name = builder.name;
        this.phoneNumber = builder.phoneNumber;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMessageContactRequest create() {
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
     * @return messageTypes
     */
    public java.util.List < String > getMessageTypes() {
        return this.messageTypes;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<UpdateMessageContactRequest, Builder> {
        private String contactId; 
        private String emailAddress; 
        private java.util.List < String > messageTypes; 
        private String name; 
        private String phoneNumber; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMessageContactRequest request) {
            super(request);
            this.contactId = request.contactId;
            this.emailAddress = request.emailAddress;
            this.messageTypes = request.messageTypes;
            this.name = request.name;
            this.phoneNumber = request.phoneNumber;
            this.title = request.title;
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
         * After you specify an email address, you need to call [SendEmailVerificationForMessageContact](~~SendEmailVerificationForMessageContact~~) to send verification information to the email address. After the verification is passed, the email address takes effect.
         */
        public Builder emailAddress(String emailAddress) {
            this.putQueryParameter("EmailAddress", emailAddress);
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * The types of messages received by the contact.
         */
        public Builder messageTypes(java.util.List < String > messageTypes) {
            this.putQueryParameter("MessageTypes", messageTypes);
            this.messageTypes = messageTypes;
            return this;
        }

        /**
         * The name of the contact.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The mobile phone number of the contact.
         * <p>
         * 
         * Specify the mobile phone number in the `<Country code>-<Mobile phone number>` format.
         * 
         * After you specify a mobile phone number, you need to call [SendPhoneVerificationForMessageContact](~~SendPhoneVerificationForMessageContact~~) to send verification information to the mobile phone number. After the verification is passed, the mobile phone number takes effect.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * The job title of the contact.
         * <p>
         * 
         * Valid values:
         * 
         * *   FinanceDirector
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   TechnicalDirector
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   MaintenanceDirector
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   CEO
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   ProjectDirector
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   Other
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public UpdateMessageContactRequest build() {
            return new UpdateMessageContactRequest(this);
        } 

    } 

}
