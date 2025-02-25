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
 * {@link SendPhoneVerificationForMessageContactRequest} extends {@link RequestModel}
 *
 * <p>SendPhoneVerificationForMessageContactRequest</p>
 */
public class SendPhoneVerificationForMessageContactRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactId")
    private String contactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    private String phoneNumber;

    private SendPhoneVerificationForMessageContactRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
        this.phoneNumber = builder.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendPhoneVerificationForMessageContactRequest create() {
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
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public static final class Builder extends Request.Builder<SendPhoneVerificationForMessageContactRequest, Builder> {
        private String contactId; 
        private String phoneNumber; 

        private Builder() {
            super();
        } 

        private Builder(SendPhoneVerificationForMessageContactRequest request) {
            super(request);
            this.contactId = request.contactId;
            this.phoneNumber = request.phoneNumber;
        } 

        /**
         * <p>The ID of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>c-qL4HqKONzOM7****</p>
         */
        public Builder contactId(String contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * <p>The mobile phone number of the contact.</p>
         * <p>The value must be in the <code>&lt;Country code&gt;-&lt;Mobile phone number&gt;</code> format.</p>
         * <p>The specified mobile phone number must be the one you specify when you call the <a href="~~AddMessageContact~~">AddMessageContact</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>86-139****1234</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        @Override
        public SendPhoneVerificationForMessageContactRequest build() {
            return new SendPhoneVerificationForMessageContactRequest(this);
        } 

    } 

}
