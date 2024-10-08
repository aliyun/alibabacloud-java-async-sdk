// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMessageContactResponseBody} extends {@link TeaModel}
 *
 * <p>AddMessageContactResponseBody</p>
 */
public class AddMessageContactResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Contact")
    private Contact contact;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddMessageContactResponseBody(Builder builder) {
        this.contact = builder.contact;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMessageContactResponseBody create() {
        return builder().build();
    }

    /**
     * @return contact
     */
    public Contact getContact() {
        return this.contact;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Contact contact; 
        private String requestId; 

        /**
         * The information about the contact.
         */
        public Builder contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddMessageContactResponseBody build() {
            return new AddMessageContactResponseBody(this);
        } 

    } 

    public static class Contact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        private Contact(Builder builder) {
            this.contactId = builder.contactId;
            this.createDate = builder.createDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contact create() {
            return builder().build();
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        public static final class Builder {
            private String contactId; 
            private String createDate; 

            /**
             * The ID of the contact.
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * The time when the contact was created.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            public Contact build() {
                return new Contact(this);
            } 

        } 

    }
}
