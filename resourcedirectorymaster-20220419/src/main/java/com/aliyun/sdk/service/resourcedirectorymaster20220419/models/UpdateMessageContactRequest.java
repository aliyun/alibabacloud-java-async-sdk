// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMessageContactRequest} extends {@link RequestModel}
 *
 * <p>UpdateMessageContactRequest</p>
 */
public class UpdateMessageContactRequest extends Request {
    @Query
    @NameInMap("ContactId")
    private String contactId;

    @Query
    @NameInMap("EmailAddress")
    private String emailAddress;

    @Query
    @NameInMap("MessageTypes")
    private java.util.List < String > messageTypes;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PhoneNumber")
    private String phoneNumber;

    @Query
    @NameInMap("Title")
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
         * ContactId.
         */
        public Builder contactId(String contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * EmailAddress.
         */
        public Builder emailAddress(String emailAddress) {
            this.putQueryParameter("EmailAddress", emailAddress);
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * MessageTypes.
         */
        public Builder messageTypes(java.util.List < String > messageTypes) {
            this.putQueryParameter("MessageTypes", messageTypes);
            this.messageTypes = messageTypes;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PhoneNumber.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * Title.
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
