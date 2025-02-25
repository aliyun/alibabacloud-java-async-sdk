// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
 * {@link AddMessageContactRequest} extends {@link RequestModel}
 *
 * <p>AddMessageContactRequest</p>
 */
public class AddMessageContactRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmailAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private String emailAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> messageTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<String> getMessageTypes() {
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
        private java.util.List<String> messageTypes; 
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
         * <p>The email address of the contact.</p>
         * <p>After you specify an email address, you need to call <a href="~~SendEmailVerificationForMessageContact~~">SendEmailVerificationForMessageContact</a> to send verification information to the email address. After the verification is passed, the email address takes effect.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>someone***@example.com</p>
         */
        public Builder emailAddress(String emailAddress) {
            this.putQueryParameter("EmailAddress", emailAddress);
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * <p>The types of messages received by the contact.</p>
         * <p>This parameter is required.</p>
         */
        public Builder messageTypes(java.util.List<String> messageTypes) {
            this.putQueryParameter("MessageTypes", messageTypes);
            this.messageTypes = messageTypes;
            return this;
        }

        /**
         * <p>The name of the contact.</p>
         * <p>The name must be unique in your resource directory.</p>
         * <p>The name must be 2 to 12 characters in length and can contain only letters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tom</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The mobile phone number of the contact.</p>
         * <p>Specify the mobile phone number in the <code>&lt;Country code&gt;-&lt;Mobile phone number&gt;</code> format.</p>
         * <blockquote>
         * <p>Only mobile phone numbers in the <code>86-&lt;Mobile phone number&gt;</code> format in the Chinese mainland are supported.</p>
         * </blockquote>
         * <p>After you specify a mobile phone number, you need to call <a href="~~SendPhoneVerificationForMessageContact~~">SendPhoneVerificationForMessageContact</a> to send verification information to the mobile phone number. After the verification is passed, the mobile phone number takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>86-139****1234</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * <p>The job title of the contact.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>FinanceDirector</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>TechnicalDirector</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>MaintenanceDirector</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>CEO</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>ProjectDirector</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Other</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TechnicalDirector</p>
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
