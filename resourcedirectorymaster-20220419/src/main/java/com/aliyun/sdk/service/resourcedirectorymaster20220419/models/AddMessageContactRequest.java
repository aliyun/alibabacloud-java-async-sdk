// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMessageContactRequest} extends {@link RequestModel}
 *
 * <p>AddMessageContactRequest</p>
 */
public class AddMessageContactRequest extends Request {
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

    private AddMessageContactRequest(Builder builder) {
        super(builder);
        this.emailAddress = builder.emailAddress;
        this.messageTypes = builder.messageTypes;
        this.name = builder.name;
        this.phoneNumber = builder.phoneNumber;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMessageContactRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<AddMessageContactRequest, Builder> {
        private String emailAddress; 
        private java.util.List < String > messageTypes; 
        private String name; 
        private String phoneNumber; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(AddMessageContactRequest request) {
            super(request);
            this.emailAddress = request.emailAddress;
            this.messageTypes = request.messageTypes;
            this.name = request.name;
            this.phoneNumber = request.phoneNumber;
            this.title = request.title;
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
        public AddMessageContactRequest build() {
            return new AddMessageContactRequest(this);
        } 

    } 

}
